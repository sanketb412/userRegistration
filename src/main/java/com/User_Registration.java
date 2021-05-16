package com;

import java.util.regex.Pattern;

public class User_Registration {

    private static final String FIRST_LAST_NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";
    private static final String EMAIL_PATTERN = "^([a-zA-Z]{3,}([+_.-][a-z])*)+@[a-z]+.com[+.in]*$";
    private static final String CONTACT_NUMBER_PATTERN = "^[+91]{2}\\s{1}([789]{1}[0-9]{9})$";
    private static final String PASSWORD_PATTERN = "^((?=.*[a-z]).{8,})$";

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

    public boolean validateContact(String contactnumber) {
        Pattern pattern = Pattern.compile(CONTACT_NUMBER_PATTERN);
        return pattern.matcher(contactnumber).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
