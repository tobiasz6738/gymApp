package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class AddDefaultUser
{

    private boolean trueFalse;

    public void addDefaultUsers(List<User> listUsers)
    {

        if (!trueFalse)
        {
            User user = new User("tobiasz", "aq12");

            listUsers.add(user);

            trueFalse = true;
        }

    }

}
