package com.example.springtobi.controllerTobi;

import com.example.springtobi.component.AddDefaultUser;
import com.example.springtobi.component.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class AddDefaultUserController
{
    @Autowired
    private DataBase dataBase;

    @Autowired
    private AddDefaultUser addDefaultUser;


    @GetMapping("/completedDataBaseNewUsers")
    public String addDefaultUsers()
    {
        this.addDefaultUser.addDefaultUsers(this.dataBase.getUsersList());
        return "gym/welcomeTobi";
    }

}
