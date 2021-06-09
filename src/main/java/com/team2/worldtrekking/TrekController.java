package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TrekController {

    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/trek")
    public String displayTreks(Model model){
        model.addAttribute("trekModel", trekRepo.findAll());
        return "trekView";
    }

}
