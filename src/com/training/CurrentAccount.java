package com.training;

public class CurrentAccount extends Account {

    double overdraftLimit;

    public CurrentAccount(int accountNumber, String customerName,
                          double balance, double overdraftLimit) {

        super(accountNumber, customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdraw successful from current account");
        } else {
            throw new InsufficientBalanceException("Exceeds overdraft limit");
        }
    }
}