package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class AddDefaultUser
{

    @Autowired
    private DataBase dataBase;

    private boolean trueFalse;


    public String addDefaultUsers()
    {

        if(!trueFalse)
        {

            User user = new User("tobiasz", "al9p");

            List<User> usersList = this.dataBase.getUsersList();

            usersList.add(user);

            trueFalse = true;
        }
        return "gym/welcomeTobi";
    }

}
