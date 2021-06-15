package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class TrekController {

    @Resource
    private TrekRepository trekRepo;

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
}
