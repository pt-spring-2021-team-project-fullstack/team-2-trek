package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@Controller
public class DifficultyController {

    @Resource
    private DifficultyRepository difficultyRepo;

    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/difficulties")
    public String displayDifficulty(Model model){
        model.addAttribute("difficultyModel", difficultyRepo.findAll());
        return "difficultiesView";
    }

    @RequestMapping("/difficulty{id}")
    public String displaySingleTrek(@RequestParam(value="id") Long id, Model model) {
        Optional<Difficulty> retrievedDifficulty = difficultyRepo.findById(id);

        Difficulty foundDifficulty = retrievedDifficulty.get();
        model.addAttribute("difficultyModel", foundDifficulty);

//        Trek foundTrek = retrievedTrek.get();
        Collection<Trek> foundTrek = trekRepo.findByDifficulty(retrievedDifficulty.get());
        model.addAttribute("trekModel", foundTrek);

        return "difficultyView";
    }

}
