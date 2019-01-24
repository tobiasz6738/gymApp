package com.example.springtobi.component;

import org.springframework.stereotype.Component;


@Component
public class LoginChecker
{


    public boolean checkLogin(String login)
    {

        return login.length() > 3 && login.length() <= 10;

    }

}
