package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LogInController
{

    @Autowired
    private DataBase dataBase;


    @GetMapping("/logowanie")
    //TODO: change method's name
    public String registerNewUserGet(Model model)
    {
        model.addAttribute("userForLogin", new User());

        return "gym/registerTobi/logIn";

    }

    @PostMapping("/logowanie")
    public String checkIsUserInOrOut()
    {

        return "gym/registerTobi/test";
    }



}

