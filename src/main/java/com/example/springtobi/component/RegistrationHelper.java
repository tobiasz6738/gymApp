package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationHelper {

    @Autowired
    private LoginChecker loginChecker;

    public String getUrlAndAddUserToDataBase(DataBase dataBase, User userForRegister)
    {
        List<User> allUser = dataBase.getUsersList();

        String logInForCheck = userForRegister.getSecurityData().getLogin();
        String passwordForCheck = userForRegister.getSecurityData().getPassword();

        boolean b = this.loginChecker.CheckLogin(logInForCheck);



        if(b == true) {
            if (allUser.isEmpty()) {
                dataBase.getUsersList().add(userForRegister);
                return "gym/welcomeTobi";
            } else

                for (User user : allUser) {
                    if (user.getSecurityData().getLogin().equals(logInForCheck) &&
                            user.getSecurityData().getPassword().equals(passwordForCheck)) {
                        return "gym/registerTobi/doubleLogin";
                    }
                }

            dataBase.getUsersList().add(userForRegister);
            return "gym/welcomeTobi";
        }else
        {
            return "gym/registerTobi/loginChecker";
        }
    }
}
