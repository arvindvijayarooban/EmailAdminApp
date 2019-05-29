package com.example.emailadminapp;

import java.util.Scanner;

public class Main {

public static void main(String [] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter user's First name");
    String uFirstName = scan.nextLine();

    System.out.println("Please enter user's Last name");
    String uLastName = scan.nextLine();
    Email email = new Email(uFirstName, uLastName);

    email.printUserInfo();


}

}
