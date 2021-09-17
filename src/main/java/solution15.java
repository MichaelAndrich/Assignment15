/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Michael Andrich
 */
/*
    prompt user for username and password
    the program will then compare with the known credentials
    create a string that will have the known password to compare the entered one to
    must use an if else statement
    display whether the credentials match or not


 */


import java.util.Scanner;

public class solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String actualPassword = "abc$123";

        System.out.println("What is your username? ");
        String user = sc.nextLine();

        System.out.println("What is the password? ");
        String newpassword = sc.nextLine();

        if(actualPassword.equals(newpassword)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }



    }
}