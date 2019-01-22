package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.DataBase;
import com.example.springtobi.component.RegistrationHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller()
public class RegisterController {


    @Autowired
    private DataBase dataBase;

    @Autowired
    private RegistrationHelper registrationHelper;

    @GetMapping("/rejestracja")
    //TODO: change method's name
    public String registerNewUserGet(Model model)
    {
        model.addAttribute("userForRegister", new User());

        return "gym/registerTobi/register";

    }

    @PostMapping("/rejestracja")
    public String registerNewUserPost(@ModelAttribute() User userForRegister)
    {


        String url = this.registrationHelper.getUrlAndAddUserToDataBase(dataBase.getUsersList(), userForRegister);

        return url;
//           ==
//          return this.registrationHelper.getUrlAndAddUserToDataBase(dataBase, userForRegister);
    }





}






