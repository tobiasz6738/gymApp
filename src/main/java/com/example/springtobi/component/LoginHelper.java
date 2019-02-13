package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginHelper
{
    private boolean logInLogOut;


    public String checkLogInAndPasswordIsRegister(List<User> usersList, User userForCheck)
    {



            for (User user : usersList)
            {
                if(!logInLogOut)
                {
                    if (user.getLogin().equals(userForCheck.getLogin()) && user.getPassword().equals(userForCheck.getPassword()))
                    {

                        return "gym/registerTobi/test";

                    }
                    logInLogOut = true;
                }

            }

        return "gym/registerTobi/test2";
    }



//    public boolean isLogInLogOut()
//    {
//        return logInLogOut;
//    }
//
//    public void setLogInLogOut(boolean logInLogOut)
//    {
//        this.logInLogOut = logInLogOut;
//    }

}

