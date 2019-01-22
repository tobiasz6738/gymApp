package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.AddDefaultUser;
import com.example.springtobi.component.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller()
public class AddDefaultUserController
{
    @Autowired
    private AddDefaultUser addDefaultUser;


    @GetMapping("/completedDataBaseNewUsers")
    public String addDefaultUsers()
    {

        String d = this.addDefaultUser.addDefaultUsers();

        return d ;
    }

}
