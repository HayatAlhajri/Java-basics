package com.training;

public class CurrentAccount extends Account {

    double overdraftLimit;

    public CurrentAccount(int accountNumber, String customerName,
                          double balance, double overdraftLimit) {

        super(accountNumber, customerName, balance);

        this.overdraftLimit = overdraftLimit;
    }
}