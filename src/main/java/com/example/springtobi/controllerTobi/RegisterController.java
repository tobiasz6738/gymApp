package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.DataBase;
import com.example.springtobi.component.RegistrationHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller()
public class RegisterController
{

    @Autowired
    private DataBase dataBase;

    @Autowired
    private RegistrationHelper helperRegister; // zmienna referencyjna jest typu jakiegos zawsze

    @GetMapping("/register")
    public String registerNewUserGet(Model model)
    {

        model.addAttribute("userForRegister", new User());

        return "gym/registerTobi/register";

    }

    @PostMapping("/register")
    public String registerNewUserPost(User userForRegister)
    {
//        String url = this.helperRegister.getUrlAndAddUserToDataBase(dataBase.getUsersList(), userForRegister);
//              ...potrzebujemy jesli pracujemy na zmiennej
//        return url;

        return this.helperRegister.getUrlAndAddUserToDataBase(dataBase.getUsersList(), userForRegister);
    }

}






