package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
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

        User userForTest = new User("tobiasz", "aq12");

        User userForTest2 = new User("tobiasz", "aq12");
        User userForTest3 = new User("12345", "qwer");


        //  when
       String resalt = this.underTest.checkLogInAndPasswordIsRegister(usersList,userForTest);

        //  then

        Assertions.assertThat(resalt).isEqualTo("gym/registerTobi/test2");

        }

        @Test
    public void iExpectedTestBecauseEveryThinkIsCorrect()
    {

       // given
        List<User> userList = new ArrayList<>();
        User userForAdd = new User("tobiasz","aq12");
        User userForAdd2 = new User("pawel","aq12");
        User userForAdd3= new User("12345","aq12w");

        userList.add(userForAdd);
        userList.add(userForAdd2);
        userList.add(userForAdd3);

        User userForTheTest = new User("12345", "aq12w");

       // when

        String result = this.underTest.checkLogInAndPasswordIsRegister(userList, userForTheTest);

       // then

        Assertions.assertThat(result).isEqualTo("gym/registerTobi/test2");

    }

}