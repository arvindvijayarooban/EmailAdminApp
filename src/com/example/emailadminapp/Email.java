package com.example.emailadminapp;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxSize;
    private String userMail;
    private String username;


    // Constructor to get the user's first and last name
    public Email(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

        this.department = getDepartment();
        this.password = setUserPassword(10);

        this.username = setUserName();

        this.setUserMail();
    }

    public void printUserInfo(){

        System.out.println("For the user "+firstName+" "+ lastName);
        // Print user name
        System.out.println("Their username is " + getUserName());
        System.out.println("Their department is " + department);
        // print user mail
        System.out.println("Their email is " + getUserMail());
        // print user mail password
        System.out.println("Their email password is " + password);
        // show the mailbox size for this user


    }

    private String setUserName (){

        String username = this.firstName + this.lastName;
        return (username.toLowerCase());
    }

    private String getUserName(){
        return this.username;
    }

    // Get the user's department
    private String getDepartment(){

        int deptID;
        int count= 0;
        do {
            if(count > 0){
                System.out.println("You have entered the wrong department id, please enter again");
                System.out.println("THE CODES ARE:\n :: 1 for sales \n :: 2 for support \n :: 3 for hr \n :: 4 for developer ");
            }

            // update code to set departments in array and also code to getDepartments (Show the departments and its ID)

            System.out.println("Do enter the Department ID of the user");
            Scanner in = new Scanner(System.in);
            deptID = in.nextInt();

            count++;
        }while(!(deptID > 0 && deptID <= 4)) ;
//System.out.println("You have entered the wrong department id, please enter again");


            if (deptID == 1) {
                department = "sales";
            } else if (deptID == 2) {
                department = "support";
            } else if (deptID == 3) {
                department = "hr";
            } else if (deptID == 4){
                department = "dev";
            }
    return department;
    }

    // Assign a password for the user
     private static String setUserPassword(int length){
         final Random RANDOM = new SecureRandom();
         final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

         StringBuilder returnValue = new StringBuilder(length);

         for(int i = 0; i < length; i++ ){

             returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
         }

      return new String(returnValue);
}
    // Set the mailboxSize for the user

    // set the email address for the user
    private void setUserMail() {

        if (username.length() > 10) {

            String tempUsername = firstName.toLowerCase();
            this.userMail = tempUsername + '.' + department + "@company.com";
        } else {

            this.userMail = this.username + '.' + department + "@company.com";
        }
    }

    private String getUserMail(){

        return this.userMail;
    }



}
