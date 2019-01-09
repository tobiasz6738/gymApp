package com.example.springtobi.component;

import org.springframework.stereotype.Component;


@Component

public class LoginChecker {



    public boolean CheckLogin(String login)
    {

        int dlugloscTegoStringa_czyliLoginu = login.length();

        if(dlugloscTegoStringa_czyliLoginu <= 3)
        {
            return false;
        }
        else
        {
            if(dlugloscTegoStringa_czyliLoginu > 10)
            {
                return false;
            }
        }

        return true;
    }

}
