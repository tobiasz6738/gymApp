
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
    public String registerNewUser(Model model)
    {
        model.addAttribute("userForRegister", new User());

        return "gym/registerTobi/register";

    }

    @PostMapping("/rejestracja")
    public String registerNewUserPost(@ModelAttribute() User UserForRegister)
    {
        this.dataBase.getUsersList().add(UserForRegister);

        return "gym/welcomeTobi";
    }
}


