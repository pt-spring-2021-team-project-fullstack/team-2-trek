package com.team2.worldtrekking;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping("/mainpage")
    public String mainPage(){
        return "worldTemplate";
    }
}
