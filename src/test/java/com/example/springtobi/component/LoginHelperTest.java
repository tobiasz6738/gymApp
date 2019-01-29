package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginHelperTest
{

    private LoginHelper underTest;

    @Before
    public void setUp()
    {

        this.underTest = new LoginHelper();

    }

    @Test
    public void test(User user)
    {

        //  given

        List<User> usersList = new ArrayList<>();

        //  when
        this.underTest.checkLogInAndPasswordIsRegister(usersList,user);

        //  then


    }

}