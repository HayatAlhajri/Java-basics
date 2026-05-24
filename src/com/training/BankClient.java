package com.training;

import java.util.ArrayList;
import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<SavingClass> savings = new ArrayList<>();
        ArrayList<CurrentAccount> currents = new ArrayList<>();

    
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter Saving Account " + (i + 1));

            System.out.print("Account Number: ");
            int accNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Balance: ");
            double bal = sc.nextDouble();

            savings.add(new SavingClass(accNo, name, bal, 4.5f));
        }

 
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter Current Account " + (i + 1));

            System.out.print("Account Number: ");
            int accNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Balance: ");
            double bal = sc.nextDouble();

            currents.add(new CurrentAccount(accNo, name, bal, 5000));
        }
        sc.close();
    }
}