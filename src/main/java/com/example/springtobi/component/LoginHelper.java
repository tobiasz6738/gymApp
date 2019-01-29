package com.example.springtobi.component;


import com.example.springtobi.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginHelper
{

    //TODO: method name in camelCase
    public String checkLogInAndPasswordIsRegister(List<User> usersList, User userForCheck)
    {

        for (User user : usersList)
        {
            if (user.getLogin().equals(userForCheck.getLogin()) && user.getPassword().equals(userForCheck.getPassword()))
            {
                return "gym/registerTobi/test";
            }
        }

        return "gym/registerTobi/test2";

    }
}

