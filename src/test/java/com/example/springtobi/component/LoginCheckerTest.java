package com.example.springtobi.component;

import org.fest.assertions.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginCheckerTest
{

    private LoginChecker underTest;

    @Before
    public void setUp()
    {
        this.underTest = new LoginChecker();
    }

    @Test
    public void test()
    {
        // given
        String incerrectLogin = "ab";

        // when
        boolean result = underTest.checkLogin(incerrectLogin);

        // then
        Assertions.assertThat(result).isEqualTo(false);

    }

    @Test
    public void shouldReturnedTrueBecauseLoginIsCorrect()
    {
        // given
        String login = "pawel";

        // when
        boolean result = underTest.checkLogin(login);

        // then
        Assertions.assertThat(result).isEqualTo(true);

    }

    @Test
    public void shouldReturnFalseBecauseLoginIsTooShort()
    {
        // given
        String login = "a";

        // when
        boolean result = underTest.checkLogin(login);

        // then
        Assertions.assertThat(result).isEqualTo(false);

    }

    @Test
    public void shouldReturnFalseBecauseLoginIsTooShort2()
    {
        // given
        String login = "af";

        // when
        boolean result = underTest.checkLogin(login);

        // then
        Assertions.assertThat(result).isEqualTo(false);

    }

    @Test
    public void shouldReturnFalseBecauseLoginIsTooLong()
    {
        // given
        String login = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        // when
        boolean result = underTest.checkLogin(login);

        // then
        Assertions.assertThat(result).isEqualTo(false);

    }


}