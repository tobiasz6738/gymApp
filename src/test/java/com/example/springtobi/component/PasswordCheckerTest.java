package com.example.springtobi.component;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class PasswordCheckerTest
{

    private PasswordChecker underTest2;

    @Before
    public void setUp()
    {
        this.underTest2 = new PasswordChecker();
    }

        @Test
        public void shouldReturnTrueBecausePasswordIsCorrect()
        {
//             given
            String password = "al9a";

//             when
            boolean result = underTest2.checkPassword(password);

//             then
            Assertions.assertThat(result).isEqualTo(true);

        }

        @Test
        public void shouldReturnFalseBecausePasswordIsTooShort()
        {
            // given
            String password = "123";

            // when
            boolean result = underTest2.checkPassword(password);

            // then
            Assertions.assertThat(result).isEqualTo(false);

        }

        @Test
        public void shouldReturnFalseBecausePasswordIsTooShort2()
        {
            // given
            String password = "a0";

            // when
            boolean result = underTest2.checkPassword(password);

            // then
            Assertions.assertThat(result).isEqualTo(false);

        }

        @Test
        public void shouldReturnFalseBecausePasswordIsTooLong()
        {
            // given
            String password = "7777777";

            // when
            boolean result = underTest2.checkPassword(password);

            // then
            Assertions.assertThat(result).isEqualTo(false);

        }


    }


