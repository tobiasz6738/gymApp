package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.fest.assertions.Assertions;
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
    public void shouldReturnTest2Because()
    {
        //  given

        List<User> usersList = new ArrayList<>();

        User userForTset = new User("tobiasz", "aq12");

        User userForTset2 = new User("tobiasz", "aq12");
        User userForTset3 = new User("12345", "qwer");


        //  when
       String resalt = this.underTest.checkLogInAndPasswordIsRegister(usersList,userForTset);

        //  then

        Assertions.assertThat(resalt).isEqualTo("gym/registerTobi/test2");

        }

}