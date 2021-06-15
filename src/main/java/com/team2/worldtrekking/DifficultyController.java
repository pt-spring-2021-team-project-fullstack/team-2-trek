package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class DifficultyController {

    @Resource
    private DifficultyRepository difficultyRepo;

    @RequestMapping("/difficulties")
    public String displayDifficulties(Model model){
        model.addAttribute("difficultiesModel", difficultyRepo.findAll());
        return "difficultiesView";

    }

    @RequestMapping("/difficulty/{id}")
    public String displaySingleDifficulty(@PathVariable long id, Model model){
        Optional<Difficulty> retrievedDifficulty = difficultyRepo.findById(id);
        Difficulty foundDifficulty = retrievedDifficulty.get();
        model.addAttribute("difficultiesModel", foundDifficulty);
        return "difficultyView";
    }




}
