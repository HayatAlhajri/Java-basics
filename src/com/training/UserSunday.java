package com.training;

import java.util.ArrayList;
import java.util.Scanner;

public class UserSunday {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Collection (ArrayList)
        ArrayList<String> names = new ArrayList<>();

        // input names
        System.out.println("Enter 3 names:");

        names.add(sc.nextLine());
        names.add(sc.nextLine());
        names.add(sc.nextLine());

        System.out.println("Names saved successfully");

      
        System.out.println("Enter name to search:");
        String search = sc.nextLine();

        if (names.contains(search)) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found");
        }

        sc.close();
    }
}