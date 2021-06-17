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

//    @Resource
//    private difficultyRepository difficultyRepo;

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
//    public String addTrek(@RequestParam String title, String description, String continent, String region,
//                          String difficulty) {
    public String addTrek(@RequestParam String title, String description, String continent, String region) {
        Continent continentToAdd;
        Region regionToAdd;
//        Difficulty difficultyToAdd;

        Optional<Continent> continentToAddOpt = continentRepo.findByTitle(title);
        Optional<Region> regionToAddOpt = regionRepo.findByTitle(title);
//        Optional<Difficulty> difficultyToAddOpt = difficultyRepo.findByMaterialType();

        if(continentToAddOpt.isEmpty()){
//            continentToAdd = new Continent(title, imageUrl);
            continentToAdd = new Continent(title);
            continentRepo.save(continentToAdd);
        } else {
            continentToAdd = continentToAddOpt.get();
        }

        if(continentToAddOpt.isEmpty()){
//            continentToAdd = new Continent(title, imageUrl);
            continentToAdd = new Continent(title);
            continentRepo.save(continentToAdd);
        } else {
            continentToAdd = continentToAddOpt.get();
        }

//        if(difficultyToAddOpt.isEmpty()){
//            difficultyToAdd = new Difficulty(difficultyLevel);
//            continentRepo.save(continentToAdd);
//        } else {
//            continentToAdd = continentToAddOpt.get();
//        }

        Optional<Trek> trekToAddOpt = trekRepo.findByTitle(title);

        if(trekToAddOpt.isEmpty()){
//            Trek trekToAdd = new Trek(title, difficulty, description, price, imageUrl, continentToAdd, regionToAdd);
//            Trek trekToAdd = new Trek(title, description, price, imageUrl, continentToAdd, regionToAdd);
            Trek trekToAdd = new Trek(title, description, continentToAdd, regionToAdd);
            trekRepo.save(trekToAdd);
        }
        return "redirect:/paper-plates/";
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

//    @GetMapping("difficulties/{title}")
//    public String displaySingleDifficulty(@PathVariable String title, Model model){
//        Optional<Difficulty> retrievedDifficulty = difficultyRepo.findByTitle(title);
//        model.addAttribute("difficultyModel", retrievedDifficulty.get());
//        return "difficultyView";
//    }
}
