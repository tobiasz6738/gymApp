package com.example.springtobi.component;

import com.example.springtobi.bean.User;
import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddDefaultUserTest
{

    private AddDefaultUser test;

    @Before
    public void setUp()
    {
        this.test = new AddDefaultUser();
    }

    @Test
    public void shouldCheckIsListNotEmpty()
    {
        //given

        List<User> userList = new ArrayList<>();

        //when
        this.test.addDefaultUsers(userList);

        //then

        Assertions.assertThat(userList).isNotEmpty();

    }

    @Test
    public void shouldReturnedCorrectLogin()
    {
        //given

        List<User> userList = new ArrayList<>();

        //when
        this.test.addDefaultUsers(userList);

        //then

        Assertions.assertThat(userList.get(0).getLogin()).isEqualTo("tobiasz");

    }


    @Test
    public void shouldReturnedCorrectPassword()
    {
        //given
        List<User> userList = new ArrayList<>();

        //when
        this.test.addDefaultUsers(userList);

        //then
        Assertions.assertThat(userList.get(0).getPassword()).isEqualTo("al9p");

    }

    @Test
    public void test()
    {
        //given
        List<User> userList = new ArrayList<>();

        //when
        this.test.addDefaultUsers(userList);

        //then
        Assertions.assertThat(userList.get(0).getPassword().length()).isEqualTo(4);
    }
}