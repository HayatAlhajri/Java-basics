package com.training;

public class Customer {

    private String customerId;
    private String customerName;
    private String gender;
    private String city;
    private double balance;   // ✅ ADD THIS

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(String customerId, String customerName, String gender, String city, double balance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.gender = gender;
        this.city = city;
        this.balance = balance;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString Method (good for file writing)
    @Override
    public String toString() {
        return customerId + "," + customerName + "," + gender + "," + city + "," + balance;
    }
}
