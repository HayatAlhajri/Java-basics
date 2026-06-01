package com.training;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustomerWriter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("customers.csv"))) {

            bw.write("customer_id,customer_name,gender,city,balance");
            bw.newLine();

            for (int i = 0; i < n; i++) {

                System.out.println("\nCustomer " + (i + 1));

                System.out.print("ID: ");
                String id = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Gender: ");
                String gender = sc.nextLine();

                System.out.print("City: ");
                String city = sc.nextLine();

                System.out.print("Balance: ");
                double balance = sc.nextDouble();
                sc.nextLine();

                Customer c = new Customer(id, name, gender, city, balance);

                if (c.getBalance() > 1000) {
                    bw.write(c.toString());
                    bw.newLine();
                    System.out.println("Saved");
                } else {
                    System.out.println("Not saved (balance ≤ 1000)");
                }
            }

            System.out.println("\nFile created successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file");
            e.printStackTrace();
        }

        sc.close();
    }
}