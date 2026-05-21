package com.training;

public class SavingClass extends Account {

   private float interestRate = 4.5f;

    public SavingClass(int accountNumber, String customerName,
                          double balance, float interestRate) {

        super(accountNumber, customerName, balance);

        this.setInterestRate(interestRate);
    }



	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
}