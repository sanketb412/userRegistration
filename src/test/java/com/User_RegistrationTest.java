package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class User_RegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        String result = validation.validateFirstName("Sanket");
        Assertions.assertEquals("Valid",result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        String result = validation.validateLastName("Bagde");
        Assertions.assertEquals("Valid",result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        String result = validation.validateEmail("sanketbagde@gmail.com");
        Assertions.assertEquals("Valid",result);
    }
    @Test
    public void givenContact_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        String result = validation.validateContact("91 8879876091");
        Assertions.assertEquals("Valid",result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        String result = validation.validatePassword("passWord123@");
        Assertions.assertEquals("Valid",result);
    }
}