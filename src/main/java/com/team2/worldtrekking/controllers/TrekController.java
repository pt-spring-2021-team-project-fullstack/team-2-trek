package com.team2.worldtrekking.controllers;

import com.team2.worldtrekking.repositories.RegionRepository;
import com.team2.worldtrekking.repositories.TrekRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TrekController {

    @Resource
    private TrekRepository trekRepo;

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/trek")
    public String displayTreks(Model model){
        model.addAttribute("trekModel", trekRepo.findAll());
        model.addAttribute("regions", regionRepo.findAllById());
        model.addAllAttributes();
        return "trekView";
    }

}