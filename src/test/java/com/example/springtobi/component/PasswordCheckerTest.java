package com.example.springtobi.component;


import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

public class PasswordCheckerTest
{

    private PasswordChecker underTest;


    @Before
    public void setUp()
    {
        this.underTest = new PasswordChecker();
    }

    @Test
    public void shouldReturnedTrueBecausePasswordIsCorrect()
    {
        String correctPassword = "al9a";

        boolean methodsCheckerPasswordCheckPasswordIsTrueOrFalse = underTest.checkPassword(correctPassword);

        Assertions.assertThat(methodsCheckerPasswordCheckPasswordIsTrueOrFalse).isEqualTo(true);
    }

    @Test
    public void shouldReturnedFalseBecausePasswordIsToShort()
    {

    //2.given

        String incorrectPassword = "1";

    //1.when  (jesli)

        boolean methodsCheckerPasswordCheckPasswordIsTrueOrFalse = underTest.checkPassword(incorrectPassword);

        //3.then  (po czym)

        Assertions.assertThat(methodsCheckerPasswordCheckPasswordIsTrueOrFalse).isEqualTo(false);
    }


    @Test
    public void shouldReturnedFalseBecausePasswordIsToLong()
    {

        //given

        String inCorrectPassword = "aflasjfaslkfjalkjf";

        //then
        boolean methodsCheckerPasswordCheckPasswordIsTrueOrFalse = underTest.checkPassword(inCorrectPassword);

        //when

        Assertions.assertThat(methodsCheckerPasswordCheckPasswordIsTrueOrFalse).isEqualTo(false);
    }





































}