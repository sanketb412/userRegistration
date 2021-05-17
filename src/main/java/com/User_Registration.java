package com;

import java.util.regex.Pattern;

public class User_Registration {

    private static final String FIRST_LAST_NAME_PATTERN = "^([A-Z][a-zA-Z]{2,})$";
    private static final String EMAIL_PATTERN = "^([a-zA-Z]{3,}([+_.-][a-z])*)+@[a-z]+.com[+.in]*$";
    private static final String CONTACT_NUMBER_PATTERN = "^[+91]{2}\\s{1}([789]{1}[0-9]{9})$";
    private static final String PASSWORD_PATTERN = "^((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$&%]).{8,})$";
    private static final String PARAMETRISED_EMAIL = "^([a-zA-Z]{3,}([+_.-]*[a-z]*[0-9]{1,}([0-9]{2,})*)*)+@[a-z]+.com{1,}[+.in]*[+.net]*[+.au]*$";

    public String validateFirstName(String firstname) throws UserAnalysisException {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        try {
            if (firstname.length() == 0) {
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Please Enter name");
            }
            else if (pattern.matcher(firstname).matches()) {
                return "Valid";
            } else
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_valid, "Please Enter valid name");
        } catch (NullPointerException e) {
            throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Enter valid name");
        }
    }
    public String validateLastName(String lastname) throws UserAnalysisException{
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        try {
            if (lastname.length() == 0) {
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Please Enter name");
            }
            else if(pattern.matcher(lastname).matches()){
                return "Valid";
            } else
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_valid, "Please Enter valid name");
        } catch (NullPointerException e) {
            throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Enter valid name");
        }
    }

    public String validateEmail(String email) throws UserAnalysisException{
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        try {
            if (email.length() == 0) {
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Please Enter email");
            }
            else if(pattern.matcher(email).matches()){
                return "Valid";
            } else
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_valid, "Please Enter valid email");
        } catch (NullPointerException e) {
            throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Enter valid email");
        }
    }

    public String validateContact(String contactnumber) throws UserAnalysisException {
        Pattern pattern = Pattern.compile(CONTACT_NUMBER_PATTERN);
        try {
            if (contactnumber.length() == 0) {
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Please Enter Contact_Number");
            }
            else if(pattern.matcher(contactnumber).matches()){
                return "Valid";
            } else
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_valid, "Please Enter valid Contact_Number");
        } catch (NullPointerException e) {
            throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Enter valid Contact_Number");
        }
    }

    public String validatePassword(String password) throws UserAnalysisException {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        try {
            if (password.length() == 0) {
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Please Enter Password");
            }
            else if (pattern.matcher(password).matches()) {
                return "Valid";
            } else
                throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_valid, "Please Enter valid Password");
        } catch (NullPointerException e) {
            throw new UserAnalysisException(UserAnalysisException.ExceptionType.Entered_Empty, "Enter valid Password");
        }
    }

    public boolean validateMultipleEmail(String Multiple) {
        Pattern pattern = Pattern.compile(PARAMETRISED_EMAIL);
        return pattern.matcher(Multiple).matches();
    }
}