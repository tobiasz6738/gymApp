package com.example.springtobi.controllerTobi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class MainControllerTobi {

    // [kto][jakiProjekt] opis
    // [tobiasz][rejestrowanie] add button in UI -> commit
    // [tobiasz][rejestrwowanie] create controller for rejestrowanie
    // [tobiasz][rejestrwowanie] create method in controler for mapping button action
    // [tobiasz][rejestrwowanie] create view for rejestrowanie

    @GetMapping("/")
    public String index() {
        return "gym/welcomeTobi";
    }



}
