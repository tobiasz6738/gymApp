package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;


@Controller()
public class RegisterController {


    @Autowired
    private DataBase dataBase;

    @GetMapping("/rejestracja")
    //TODO: change method's name
    public String registerNewUserGet(Model model)
    {
        model.addAttribute("userForRegister", new User());

        return "gym/registerTobi/register";

    }

    @PostMapping("/rejestracja")
    public String registerNewUserPost(@ModelAttribute() User userForRegister) {
        //TODO: check if userForRegister is already in dataBase;


        List<User> allUser = this.dataBase.getUsersList();

        String logInForCheck = userForRegister.getSecurityData().getLogin();
        String passwordForCheck = userForRegister.getSecurityData().getPassword();


        if (allUser.isEmpty())
            {
                this.dataBase.getUsersList().add(userForRegister);
                return "gym/welcomeTobi";
           }
            else{

                for (User user : allUser) {
                    if (user.getSecurityData().getLogin().equals(logInForCheck) &&
                            user.getSecurityData().getPassword().equals(passwordForCheck))
                        return "gym/registerTobi/good";

                }
            this.dataBase.getUsersList().add(userForRegister);
            }
          return "gym/welcomeTobi";
        }
    }






