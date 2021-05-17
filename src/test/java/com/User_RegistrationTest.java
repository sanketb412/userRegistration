package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class User_RegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserAnalysisException {
        User_Registration validation = new User_Registration();
        try {
            String result = validation.validateFirstName("Sanket");
            System.out.println(result);
            Assertions.assertEquals("Valid", result);
        } catch (UserAnalysisException e) {
            Assertions.assertEquals(UserAnalysisException.ExceptionType.Entered_valid, e.getMessage());
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserAnalysisException {
        User_Registration validation = new User_Registration();
        try {
            String result = validation.validateLastName("Bagde");
            Assertions.assertEquals("Valid",result);
        } catch (UserAnalysisException e) {
            Assertions.assertEquals(UserAnalysisException.ExceptionType.Entered_valid, e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws UserAnalysisException {
        User_Registration validation = new User_Registration();
        try {
            String result = validation.validateEmail("sanketbagde@gmail.com");
            Assertions.assertEquals("Valid",result);
        } catch (UserAnalysisException e) {
            Assertions.assertEquals(UserAnalysisException.ExceptionType.Entered_valid, e.getMessage());
        }
    }

    @Test
    public void givenContact_WhenProper_ShouldReturnTrue()  throws UserAnalysisException {
        User_Registration validation = new User_Registration();
        try {
            String result = validation.validateContact("91 8879876091");
            Assertions.assertEquals("Valid",result);
        } catch (UserAnalysisException e) {
            Assertions.assertEquals(UserAnalysisException.ExceptionType.Entered_valid, e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserAnalysisException {
        User_Registration validation = new User_Registration();
        try {
            String result = validation.validatePassword("passWord123@");
            Assertions.assertEquals("Valid",result);
        } catch (UserAnalysisException e) {
            Assertions.assertEquals(UserAnalysisException.ExceptionType.Entered_valid, e.getMessage());
        }
    }
}