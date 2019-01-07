package com.example.springtobi.controllerTobi;


import com.example.springtobi.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class RegisterController {


    @GetMapping("/rejestracja")
    public String register(Model model)
    {
        model.addAttribute("userForRegister", new User());

        return "gym/registerTobi/register";
    }


}
