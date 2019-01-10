package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationHelper
{

    @Autowired
    private LoginChecker loginChecker;

    public String getUrlAndAddUserToDataBase(List<User> allUser, User userForRegister)
    {
        if (this.loginChecker.checkLogin(getLogin(userForRegister)))
        {
            if (allUser.isEmpty())
            {
//                dataBase.getUsersList().add(userForRegister);
                allUser.add(userForRegister);
                return "gym/welcomeTobi";
            } else

                for (User user : allUser)
                {
                    if (getLogin(user).equals(getLogin(userForRegister)) &&
                            getPassword(user).equals(getPassword(userForRegister)))
                    {
                        return "gym/registerTobi/doubleLogin";
                    }
                }

//            dataBase.getUsersList().add(userForRegister);
            allUser.add(userForRegister);
            return "gym/welcomeTobi";
        } else
        {
            return "gym/registerTobi/loginChecker";
        }
    }

    private String getPassword(User user)
    {
        return user.getSecurityData().getPassword();
    }

    private String getLogin(User user)
    {
        return user.getSecurityData().getLogin();
    }
}
