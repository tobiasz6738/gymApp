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
    public String registerNewUserGet(Model model)
    {
        model.addAttribute("userForLogin", new User());

        return "gym/registerTobi/logIn";
    }

    //TODO: 1) commit previous work 2) extract login logic to some Component 3) write UnitTest on this Component

    @PostMapping("/logowanie")
    public String checkIsUserInOrOut(User userForCheck)
    {

        List<User> usersList = this.dataBase.getUsersList();

        String login = userForCheck.getLogin();
        String password = userForCheck.getPassword();


        for (User user : usersList)
        {
            if(user.getLogin().equals(login) && user.getPassword().equals(password))
            {
                return "gym/registerTobi/test";
            }

        }

        return "gym/registerTobi/test2";
    }

}

