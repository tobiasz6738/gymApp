package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class AddDefaultUserController
{


    @GetMapping("/completedDataBaseNewUsers")
    public String addDefaultUsers()
    {


        return "gym/welcomeTobi";
    }



}
