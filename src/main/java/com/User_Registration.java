package com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class User_Registration {

    private static final String FIRST_LAST_NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";
    private static final String EMAIL_PATTERN = "^([a-zA-Z]{3,}([+_.-][a-z])*)+@[a-z]+.com[+.in]*$";
    private static final String CONTACT_NUMBER_PATTERN = "^[+91]{2}\\s{1}([789]{1}[0-9]{9})$";
    private static final String PASSWORD_PATTERN = "^((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$&%]).{8,})$";

    public static void main(String[] args){
        System.out.println("..###..Welcome to User Registration Program..###..");
    }
    public String validateFirstName(String firstname) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        if(pattern.matcher(firstname).matches()){
            return "Valid";
        }
        else
            return "NotValid";
    }
    public String validateLastName(String lastname) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        if(pattern.matcher(lastname).matches()){
            return "Valid";
        }
        else
            return "NotValid";
    }

    public String validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        if(pattern.matcher(email).matches()){
            return "Valid";
        }
        else
            return "NotValid";
    }

    public String validateContact(String contactnumber) {
        Pattern pattern = Pattern.compile(CONTACT_NUMBER_PATTERN);
        if(pattern.matcher(contactnumber).matches()){
            return "Valid";
        }
        else
            return "NotValid";
    }

    public String validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        if(pattern.matcher(password).matches()){
            return "Valid";
        }
        else
            return "NotValid";
    }
}
