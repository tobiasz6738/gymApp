package com.example.springtobi.component;

import org.springframework.stereotype.Component;

@Component
public class PasswordChecker
{

    public boolean checkPassword(String password)
    {


        boolean checkCorrectLenght = password.length() > 3 && password.length() <= 10;



        return checkCorrectLenght;

    }


}

