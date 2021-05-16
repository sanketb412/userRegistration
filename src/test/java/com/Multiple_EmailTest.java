package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

public class Multiple_EmailTest {

    private String email2Test;
    private boolean expectedResult;

    public Multiple_EmailTest(String email, boolean expectedResult){
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }

    public static Collection data() {
        return Arrays.asList(new Object [][] {{"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",false},
                {"abc+100@gmail.com",true},
                {"abc@1.com",true} });
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        User_Registration validation = new User_Registration();
        boolean result = validation.validateMultipleEmail(this.email2Test);
        Assertions.assertEquals(this.expectedResult,result);
    }
}
