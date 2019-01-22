package com.example.springtobi.controllerTobi;

import com.example.springtobi.bean.User;
import com.example.springtobi.component.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class AddDefaultUserController
{

    @Autowired
    private DataBase dataBase;


    @GetMapping("/completedDataBaseNewUsers")
    public String addDefaultUsers()
    {
            User tobiasz = createUser("tobiasz", "al9a");


            this.dataBase.getUsersList().add(createUser("pawel", "a9lb"));
            this.dataBase.getUsersList().add(tobiasz);


        return "gym/welcomeTobi";
    }

    private User createUser(String login, String password)
    {
        User user = new User();

        user.getSecurityData().setLogin(login);
        user.getSecurityData().setPassword(password);

        return user;
    }


}
