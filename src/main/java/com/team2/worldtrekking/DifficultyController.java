package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class DifficultyController {

    @Resource
    private DifficultyRepository difficultyRepo;

    @RequestMapping("/difficulty")
    public String displayDifficulty(Model model){
        model.addAttribute("difficultyModel", difficultyRepo.findAll());
        return "difficulty";

    }

}
