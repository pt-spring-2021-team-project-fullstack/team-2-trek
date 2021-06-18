package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/continents")
    public String displayContinents(Model model){
        model.addAttribute("continentModel", continentRepo.findAll());
        return "continentsView";
    }

    @RequestMapping("/continent{id}")
    public String displaySingleContinent(@RequestParam(value="id") Long id, Model model) {
        Optional<Continent> retrievedContinent = continentRepo.findById(id);

        if (retrievedContinent.isPresent()) {
            Continent foundContinent = retrievedContinent.get();
            model.addAttribute("continentModel", foundContinent);

            Collection<Trek> foundTreks = trekRepo.findByContinent(retrievedContinent.get());
            model.addAttribute("trekModel", foundTreks);
        }

        return "continentView";
    }
}