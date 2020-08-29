package com.akandrewkoch.testApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String displayHomePage(){
        return "index.html";
    }

    @GetMapping("/goodbye")
    public String displayGoodbye() {
        return "goodbye";
    }
}
