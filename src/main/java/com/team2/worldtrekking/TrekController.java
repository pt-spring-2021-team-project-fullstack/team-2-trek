package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class TrekController {

    @Resource
    private TrekRepository trekRepo;

    @Resource
    private ContinentRepository continentRepo;

    @Resource
    private RegionRepository regionRepo;

    @Resource
    private DifficultyRepository difficultyRepo;

    @RequestMapping("/treks")
    public String displayTreks(Model model) {
        model.addAttribute("trekModel", trekRepo.findAll());
        return "treksView";
    }

    @RequestMapping("/trek{id}")
    public String displaySingleTrek(@RequestParam(value="id") Long id, Model model) {
        Optional<Trek> retrievedTrek = trekRepo.findById(id);
        Trek foundTrek = retrievedTrek.get();
        model.addAttribute("trekModel", foundTrek);
        return "TrekView";
    }

    @PostMapping("/add-trek")
    public String addTrek(@RequestParam String title, @RequestParam String description,@RequestParam String continent, @RequestParam String region, @RequestParam String difficulty) {
        Continent continentToAdd;
        Region regionToAdd;
        Difficulty difficultyToAdd;

        Optional<Trek> trekToAddOpt = trekRepo.findByTitle(title);
        Optional<Continent> continentToAddOpt = continentRepo.findByTitle(title);
        Optional<Region> regionToAddOpt = regionRepo.findByTitle(title);
        Optional<Difficulty> difficultyToAddOpt = difficultyRepo.findByDifficulty(difficulty);

        if(continentToAddOpt.isEmpty()){
            continentToAdd = new Continent(title);
            continentRepo.save(continentToAdd);
        } else {
            continentToAdd = continentToAddOpt.get();
        }

        if(regionToAddOpt.isEmpty()){
            regionToAdd = new Region(title);
            regionRepo.save(regionToAdd);
        } else {
            regionToAdd = regionToAddOpt.get();
        }

        if(difficultyToAddOpt.isEmpty()){
            difficultyToAdd = new Difficulty(difficulty);
            difficultyRepo.save(difficultyToAdd);
        } else {
            difficultyToAdd = difficultyToAddOpt.get();
        }


        if(trekToAddOpt.isEmpty()){

            Trek trekToAdd = new Trek(title, description, continentToAdd, regionToAdd,difficultyToAdd);
            trekRepo.save(trekToAdd);
        }
        return "redirect:/treks";
    }

    @GetMapping("/continents/{title}")
    public String displaySingleContinent(@PathVariable String title, Model model){
        Optional<Continent> retrievedContinent = continentRepo.findByTitle(title);
        model.addAttribute("continentModel", retrievedContinent.get());
        return "continentView";
    }

    @GetMapping("/regions/{title}")
    public String displaySingleRegion(@PathVariable String title, Model model){
        Optional<Region> retrievedRegion = regionRepo.findByTitle(title);
        model.addAttribute("regionModel", retrievedRegion.get());
        return "regionView";
    }

    @GetMapping("difficulties/{difficulty}")
    public String displaySingleDifficulty(@PathVariable String difficulty, Model model){
        Optional<Difficulty> retrievedDifficulty = difficultyRepo.findByDifficulty(difficulty);
        model.addAttribute("difficultyModel", retrievedDifficulty.get());
        return "difficultyView";
    }
}
