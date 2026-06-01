package com.training;

public class AccountClient {

    public static void main(String[] args) throws InsufficientBalanceException {

        SavingClass s1 =
                new SavingClass(101, "Hayat", 5000, 5.5f);

        System.out.println("Before deposit:");
        s1.displayBalance();

        s1.deposit(300);

        System.out.println("After deposit:");
        s1.displayBalance();

        SavingClass s2 =
        		new SavingClass(102,"Noof",6000,1000);
       
        CurrentAccount c1 =
                new CurrentAccount(102, "Maryam", 7000, 2000);

        c1.withdraw(500);

        c1.displayBalance();

        System.out.println("Hayat Saving balance is : 5300");
        System.out.println("Maryam Current balance is : 6500");
    }
}