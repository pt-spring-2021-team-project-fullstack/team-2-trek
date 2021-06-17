package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class DifficultyController {

    @Resource
    private DifficultyRepository difficultyRepo;

    @RequestMapping("/difficulty")
    public String displayDifficulties(Model model){
        model.addAttribute("difficultiesModel", difficultyRepo.findAll());
        return "difficulty";

    }


}
