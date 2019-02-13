package com.example.springtobi.bean;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

public class UserTest
{

    private User underTest;


    @Before
    public void setUp()
    {
        this.underTest = new User();
    }

    @Test
    public void shouldReturnFalseBecauseIncorrectLogAndPass()
    {
 //      given
        underTest.setLogin("dupa");
        underTest.setPassword("dupa2");

 //      then
        boolean result = underTest.isAdmin();

 //      when
        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void test2()
    {
        //      given
        underTest.setLogin("admin");
        underTest.setPassword("admin");

        //      then
        boolean result = underTest.isAdmin();

        //      when
        Assertions.assertThat(result).isEqualTo(true);

    }

}