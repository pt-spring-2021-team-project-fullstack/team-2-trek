package com.team2.worldtrekking.controllers;

import com.team2.worldtrekking.models.Region;
import com.team2.worldtrekking.repositories.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegionController {

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping({"/regions", "/", ""})
    public String displayRegions(Model model) {
        model.addAttribute("regions", regionRepo.findAll());
        return "regionsView";
    }

    @GetMapping("/regions/{name}")
    public String displaySingleRegion(@PathVariable String name, Model model) {
        Region retrievedRegion = regionRepo.findRegionByName(name);
        model.addAttribute("region", retrievedRegion);
        return "regionView";
    }
}
