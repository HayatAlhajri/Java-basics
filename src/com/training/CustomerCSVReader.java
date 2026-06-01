package com.training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerCSVReader {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\welcome\\OneDrive\\Desktop\\customer.csv"));

            BufferedWriter bw = new BufferedWriter(
                new FileWriter("male_customer.csv"))
        ) {

            // Write header in output file
            bw.write("customer_id,customer_name,gender,city");
            bw.newLine();

            // Skip header in input file
            br.readLine();

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Customer customer =
                        new Customer(data[0], data[1], data[2], data[3]);

                System.out.println(customer);

                // Write ONLY male customers to new file
                if (customer.getGender().equalsIgnoreCase("Male")) {

                    bw.write(data[0] + "," +
                             data[1] + "," +
                             data[2] + "," +
                             data[3]);

                    bw.newLine();
                }
            }

            System.out.println("Male customers file created successfully!");

        } catch (FileNotFoundException e) {

            System.out.println("File not found: customer.csv");
            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error reading or writing file.");
            e.printStackTrace();
        }
    }
}