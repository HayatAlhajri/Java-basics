package com.training;

public class Customer {

    private String customerId;
    private String customerName;
    private String gender;
    private String city;

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(String customerId, String customerName, String gender, String city) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.gender = gender;
        this.city = city;
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
   
    // toString Method
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId
                + ", customerName=" + customerName
                + ", gender=" + gender
                + ", city=" + city + "]";
    }
}
