package com.example.springtobi.controllerTobi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class MainControllerTobi {

    @GetMapping("/")

    public String index() {
        return "gym/welcomeTobi";
    }


}
