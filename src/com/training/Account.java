package com.training;

public abstract class Account {

    protected int accountNumber;
    protected String customerName;
    protected double balance;

    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully");
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public double displayBalance() {
        return balance;
    }
}

//Abstract method: No implementation
//Concrete method: having implementation

//Interface: 100% abstract - explore interface