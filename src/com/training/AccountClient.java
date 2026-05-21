package com.training;

public class AccountClient {

    public static void main(String[] args) {

        SavingClass s1 =
                new SavingClass(101, "Hayat", 5000, (float) 5.5);

        CurrentAccount c1 =
                new CurrentAccount(102, "Maryam", 7000, 2000);

        s1.deposit(1000);
        s1.displayBalance();

        c1.withdraw(500);
        c1.displayBalance();
        
        
        System.out.print("Hayat Saving balance is :6000");
        System.out.print("   ,   ");
        System.out.print("Maryam Current balance is :6500");
    }
}