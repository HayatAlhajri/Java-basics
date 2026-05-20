package com.training;

import java.util.Scanner;

public class Customer2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (i < 3) {

            i++;

            System.out.println("Enter first customer name :" + i );
            String firstName = sc.nextLine();

            System.out.println("Enter last customer name: " + i );
            String lastName = sc.nextLine();

            System.out.println("Enter age :" + i );
            int age = sc.nextInt();
            sc.nextLine(); // clears the Enter key

            System.out.println("Customer Saved:");
            System.out.println(firstName + " " + lastName + " - Age: " + age);

         
        }

        System.out.println("Total number of customers saved: " + i);

        byte b = 112;
        short s = 115;

        s = b; // valid automatic conversion

        sc.close();
    }
}