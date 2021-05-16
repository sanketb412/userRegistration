package com;

import java.util.regex.Pattern;

public class User_Registration {

    public static void main(String[] args){
        System.out.println("..###..Welcome to User Registration Program..###..");
    }
    private static final String FIRST_NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";

    public boolean validateFirstName(String firstname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstname).matches();
    }
}