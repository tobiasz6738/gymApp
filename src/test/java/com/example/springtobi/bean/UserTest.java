package com.example.springtobi.bean;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest
{

    private User underTest;


    @Before
    public void setUp()
    {
        this.underTest = new User();
    }

    @Test
    public void test()
    {
        //given
       String login = "admin";
        //then
        boolean result = underTest.isAdult(login);

        //when
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void test2()
    {
    }



}