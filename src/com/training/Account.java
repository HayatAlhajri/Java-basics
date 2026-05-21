package com.training;

public class Account {

    protected int accountNumber; // number so integer
    protected String customerName;
   protected  double balance; // because this is will be decimal

    // constructor
    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // deposit
   public void deposit(double amount) {
        balance = balance + amount;
    }

    // withdraw
   public void withdraw(double amount) {
        balance = balance - amount;  
   
    }

    // display balance
   public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}