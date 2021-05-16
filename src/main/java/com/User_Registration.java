package com;

import java.util.regex.Pattern;

public class User_Registration {

    private static final String FIRST_LAST_NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";
    private static final String EMAIL_PATTERN = "^([a-zA-Z]{3,}([+_.-][a-z])*)+@[a-z]+.com[+.in]*$";

    public static void main(String[] args){
        System.out.println("..###..Welcome to User Registration Program..###..");
    }
    public boolean validateFirstName(String firstname) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        return pattern.matcher(firstname).matches();
    }
    public boolean validateLastName(String lastname) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        return pattern.matcher(lastname).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
