package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Check_ByLambda {

    private static final String FIRST_LAST_NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";
    private static final String EMAIL_PATTERN = "^([a-zA-Z]{3,}([+_.-][a-z])*)+@[a-z]+.com[+.in]*$";
    private static final String CONTACT_NUMBER_PATTERN = "^[+91]{2}\\s{1}([789]{1}[0-9]{9})$";
    private static final String PASSWORD_PATTERN = "^((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$&%]).{8,})$";

    private void firstNameValidation ()  {
        List<String> myList = Arrays.asList("Sanket","akash", "Shweta");
        //Matching the given name with regular expression
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(firstName -> { System.out.println("The Valid FirstName of " + firstName + " check for valid " + predicate.test(firstName)); } );
    }

    private void lastNameValidation () {
        List<String> myList = Arrays.asList("Bagde","Gawai","singh");
        //Matching the given name with regular expression
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(lastName -> { System.out.println("The Valid LastName of " + lastName + " check for valid " + predicate.test(lastName)); } );
    }

    private void eMailAddressValidation ()  {
        List<String> myList = Arrays.asList("sasnketbagde@gmail.com");
        //Matching the given Email Address with regular expression
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(emailAddress -> { System.out.println("The Valid Email Address of " + emailAddress + " check for valid " + predicate.test(emailAddress)); } ) ;
    }

    private void mobileNumberValidation ()  {
        List<String> myList = Arrays.asList("91 8375027465","85 637623938564","85558","99 4561237895");
        //Matching the given PhoneNumber with regular expression
        Pattern pattern = Pattern.compile(CONTACT_NUMBER_PATTERN);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(mobileNumber -> { System.out.println("The Valid Mobile Number of " + mobileNumber + " check for valid " + predicate.test(mobileNumber)); } );
    }

    private void passwordValidation ()  {
        List<String> myList = Arrays.asList("Password@1","passWord@123","password@123");
        //Matching the given password with regular expression
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Predicate<String> predicate = pattern.asPredicate();
        myList.forEach(password -> { System.out.println("The Valid Password of " + password + " check for valid " + predicate.test(password)); } );
    }

    public static void main(String[] args) {
        System.out.println("..###...Welcome to User Registration Program...###.."); //Printing the Welcome Message
        Check_ByLambda userRegistration = new Check_ByLambda();
        userRegistration.firstNameValidation();//calling firstNameValidation Method
        System.out.println("---------------------------------------------------");
        userRegistration.lastNameValidation();//calling lastNameValidation Method
        System.out.println("---------------------------------------------------");
        userRegistration.eMailAddressValidation();//calling eMailValidation Method
        System.out.println("---------------------------------------------------");
        userRegistration.mobileNumberValidation();//calling mobileNumberValidation Method
        System.out.println("---------------------------------------------------");
        userRegistration.passwordValidation();//calling passwordValidation Method
    }
}
