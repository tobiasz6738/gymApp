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
            User user2 = new User("pawel", "aq12");
            User user3 = new User("aq12", "aq12");


            listUsers.add(user);
            listUsers.add(user2);
            listUsers.add(user3);

            trueFalse = true;
        }

    }

}
