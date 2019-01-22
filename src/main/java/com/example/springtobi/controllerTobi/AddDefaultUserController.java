package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller()
public class AddDefaultUserController
{
    @Autowired
    private AddDefaultUserController addDefaultUserController;



    @GetMapping("/completedDataBaseNewUsers")
    public String addDefaultUsers()
    {




        return "gym/welcomeTobi";
    }

}
