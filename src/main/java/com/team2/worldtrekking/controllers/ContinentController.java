package com.team2.worldtrekking.controllers;

import com.team2.worldtrekking.repositories.ContinentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;

    @RequestMapping("/continent")
    public String displayContinents(Model model){
        model.addAttribute("continentModel", continentRepo.findAll());
        return "continentView";
    }
}
