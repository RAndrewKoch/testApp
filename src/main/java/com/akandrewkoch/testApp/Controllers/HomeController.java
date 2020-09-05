package com.akandrewkoch.testApp.Controllers;

import com.akandrewkoch.testApp.Models.Data.ThingRepository;
import com.akandrewkoch.testApp.Models.Thing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ThingRepository thingRepository;

    @GetMapping
    public String displayHomePage(){
        Thing newThing = new Thing(3);
        thingRepository.save(newThing);
        return "index.html";
    }

    @GetMapping("/goodbye")
    public String displayGoodbye() {
        return "goodbye";
    }
}
