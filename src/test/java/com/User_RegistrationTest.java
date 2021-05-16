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
    @Test
    public void givenContact_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        boolean result = validation.validateContact("91 8879876091");
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        boolean result = validation.validatePassword("password");
    }
}