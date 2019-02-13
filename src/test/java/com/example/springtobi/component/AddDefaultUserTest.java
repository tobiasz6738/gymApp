package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddDefaultUserTest
{

    private AddDefaultUser underTest;

    @Before
    public void setUp()
    {
        this.underTest = new AddDefaultUser();
    }

    @Test
    public void shouldCheckIsListNotEmpty()
    {
        //given

        List<User> userList = new ArrayList<>();

        //when
        this.underTest.addDefaultUsers(userList);

        //then

        Assertions.assertThat(userList).isNotEmpty();

    }

    @Test
    public void shouldReturnedCorrectLogin()
    {
        //given

        List<User> userList = new ArrayList<>();

        //when
        this.underTest.addDefaultUsers(userList);

        //then

        Assertions.assertThat(userList.get(0).getLogin()).isEqualTo("tobiasz");

    }


    @Test
    public void shouldReturnedCorrectPassword()
    {
        //given
        List<User> userList = new ArrayList<>();

        //when
        this.underTest.addDefaultUsers(userList);

        //then
        Assertions.assertThat(userList.get(0).getPassword()).isEqualTo("aq12");

    }

    @Test
    public void test()
    {
        //given
        List<User> userList = new ArrayList<>();

        //when
        this.underTest.addDefaultUsers(userList);

        //then
        Assertions.assertThat(userList.get(0).getPassword().length()).isEqualTo(4);
    }

}