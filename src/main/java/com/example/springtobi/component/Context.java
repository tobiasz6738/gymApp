package com.example.springtobi.component;


import com.example.springtobi.bean.User;
import org.springframework.stereotype.Component;

/*

We create Context because We need who is logIn

 */

@Component
public class Context {

    private User logInUser;

    public User getLogInUser()
    {
        return logInUser;
    }

    public void setLogInUser(User logInUser)
    {
        this.logInUser = logInUser;
    }
}
