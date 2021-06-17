package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class RegionController {

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/regions")
    public String displayRegions(Model model){
        model.addAttribute("regionModel", regionRepo.findAll());
        return "regionsView";
    }

    @RequestMapping("/region{id}")
    public String displaySingleRegion(@RequestParam(value="id") Long id, Model model) {
        Optional<Region> retrievedRegion = regionRepo.findById(id);
        Region foundRegion = retrievedRegion.get();
        model.addAttribute("regionModel", foundRegion);
        return "regionView";

    }
}