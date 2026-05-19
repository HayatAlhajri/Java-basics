package com.training;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // we use scanner library to let the customer to write the inputt himself 

        System.out.println("Enter customer name:");
        String customerName = sc.nextLine();

        System.out.println("Enter first name:");
        String firstName = sc.nextLine();

        System.out.println("Enter last name:");
        String lastName = sc.nextLine();

        System.out.println("Enter age:");
        int age = sc.nextInt();

        byte b = 112;
        short s = 115;

        s = b; // valid automatic conversion

        System.out.println("Customer Class");
        System.out.println("Customer Name: " + customerName);

        System.out.println("Customer Details: " 
            + firstName + " " 
            + lastName + ", Age: " 
            + age);

        // Check eligibility
        System.out.println("Customer Name: " + customerName);

        if (age >= 18) {
            System.out.println("Eligible to open an account");
        } else {
            System.out.println("Not yet eligible to open an account");
        }
        sc.close();
    }
}

// next()--> will take simple string without space
//next()-->to input intger value
// import shortcut : ctrl+shift+o
// java is a strongly typed language 
// variable is a place holder pointing to memory location 
// 

//create variables that will store customer first name and
//customer last name , customer age
// and display all the customer details in a single line

// /////////////////////////////////////////////////////


// take the customer details from user using scanner class
//check if the customer is more than 18 then display
//eligible to open an account
// else display :not yet eligible to open an acc.