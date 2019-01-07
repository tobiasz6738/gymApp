package com.example.springtobi.controllerTobi;


import com.example.springtobi.bean.User;
import com.example.springtobi.component.Context;
import com.example.springtobi.component.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginController {


    @Autowired
    private DataBase dataBase;
    @Autowired
    private Context context;

    @GetMapping("/logowanie")
    public String logInUser(Model model)
    {
        model.addAttribute("userForLogIn", new User());

        return "gym/registerTobi/logIn";
    }


    @PostMapping("/logowanie")
    public String logInUserPost(Model model, @ModelAttribute() User userForRegistration)
    {
        List<User> allUsers = this.dataBase.getUsersList();

       String logInForCheck = userForRegistration.getSecurityData().getLogin();
       String passwordForCheck = userForRegistration.getSecurityData().getPassword();

       for(User person :allUsers)
       {
           if(person.getSecurityData().getLogin().equals(logInForCheck) &&
                person.getSecurityData().getPassword().equals(passwordForCheck))

               this.context.setLogInUser(person);

           return "gym/context/whoIsLoggedIn";
       }

        return "gym/welcomeTobi";
    }
}
