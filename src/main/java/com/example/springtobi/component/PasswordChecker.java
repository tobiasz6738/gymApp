package com.example.springtobi.component;

import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class PasswordChecker
{

    public boolean checkPassword(String password)
    {



        boolean contains = password.contains("l" + "9");

        boolean checkCorrectLenght = password.length() > 3 && password.length() <= 6 && contains && password.charAt(0) == 'a';
        return checkCorrectLenght;



    }


}

