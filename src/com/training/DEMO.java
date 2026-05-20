package com.training;

import java.util.Scanner;

public class DEMO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (true) {

            System.out.println("Enter X to exit or any key to continue:");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("X"))
                break;

            sc.nextLine(); // clear buffer

            i++;

            System.out.println("Enter first customer name :" + i);
            sc.nextLine();

            System.out.println("Enter last customer name :" + i);
            sc.nextLine();

            System.out.println("Enter age :" + i);

            int age = sc.nextInt();
            sc.nextLine(); // clears buffer
        }

        System.out.println("Total number of customers saved: " + i);

        for (int j = 0; j < 3; j++) {
            System.out.println("Number of iteration " + (j + 1));
        }

        int k = 0;
        do {

            System.out.println("inside do while loop");
            k++;

        } while (k < 3);

        byte b = 112;
        short s = 115;

        s = b; // valid automatic conversion

        sc.close();
    }
}



