package com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Multiple_Email {

    private void emails() {
        for (int i = 0; i<=8; i++) {
            Scanner email = new Scanner(System.in);
            System.out.println("Enter the Valid Email ID:-");
            String checkemail = email.nextLine();
            boolean x = Pattern.matches("^([a-zA-Z]{3,}([+_.-]*[a-z]*[0-9]{1,}([0-9]{2,})*)*)+@[a-z]+.com{1,}[+.in]*[+.net]*[+.au]*$", checkemail);
            if (x == true) {
                System.out.println("Valid email\n");
            } else {
                System.out.println("Invalid email\n");
            }
        }

    }
    public static void main(String[] args){
        Multiple_Email register = new Multiple_Email();
        register.emails();
    }
}


