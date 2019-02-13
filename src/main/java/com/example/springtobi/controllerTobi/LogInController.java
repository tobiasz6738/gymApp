package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.DataBase;
import com.example.springtobi.component.LoginHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogInController
{

    @Autowired
    private DataBase dataBase;

    @Autowired
    private LoginHelper loginHelper;

    @GetMapping("/logIn")
    public String registerNewUserGet(Model model)
    {
        model.addAttribute("userForLogin", new User());

        return "gym/registerTobi/logIn";
    }

    //TODO: 1) commit previous work 2) extract login logic to some Component 3) write UnitTest on this Component

    @PostMapping("/logIn")
    public String checkIsUserInOrOut(User userForLogin)
    {

        String urlw = this.loginHelper.checkLogInAndPasswordIsRegister(dataBase.getUsersList(), userForLogin);

        return urlw;
    }



}

