package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class User_RegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        boolean result = validation.validateFirstName("Sanket");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        boolean result = validation.validateLastName("Bagde");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        boolean result = validation.validateEmail("sanketbagde@gmail.com");
        Assertions.assertTrue(result);
    }
}