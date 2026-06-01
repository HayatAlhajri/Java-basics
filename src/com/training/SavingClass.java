package com.training;

public class SavingClass extends Account {

    private float interestRate = 4.5f;

    public SavingClass(int accountNumber, String customerName,
                       double balance, float interestRate) {

        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful from saving account");
        } else {
            throw new InsufficientBalanceException("Not enough balance in saving account");
        }
    }
}

	
	
