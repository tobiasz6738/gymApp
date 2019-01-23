package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;


@Component
public class AddDefaultUser
{

    private boolean trueFalse;

    public void addDefaultUsers(List<User> listUsers)
    {

        if(!trueFalse)
        {

            User user = new User("tobiasz", "al9p");

            listUsers.add(user);

            trueFalse = true;
        }

    }
}
