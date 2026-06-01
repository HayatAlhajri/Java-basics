package com.training;

import java.util.Objects;

// Encapsulation
public class User implements Comparable<User> {

    // instance variables
    protected String userId;
    protected String userName;
    protected String userEmail;
    protected int age;   // NEW FIELD

    // static variable
    static String organizationName;

    // Default constructor
    public User() {
        System.out.println("User constructor called");
    }

    // Parameterized constructor
    public User(String userId, String userName,
                String userEmail, int age) {

        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.age = age;
    }

    // Getter and Setter methods

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    // AGE GETTER & SETTER

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "User [userId=" + userId +
                ", userName=" + userName +
                ", userEmail=" + userEmail +
                ", age=" + age + "]";
    }

    @Override
    public int hashCode() {

        return Objects.hash(userEmail, userId,
                userName, age);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        User other = (User) obj;

        return Objects.equals(userEmail, other.userEmail)
                && Objects.equals(userId, other.userId)
                && Objects.equals(userName, other.userName)
                && age == other.age;
    }

    @Override
    public int compareTo(User o) {

        return this.userId.compareTo(o.userId);
    }
}