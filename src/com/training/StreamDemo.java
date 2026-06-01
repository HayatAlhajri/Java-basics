package com.training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("101",
                "Hayat",
                "hayat@gmail.com",
                24));

        users.add(new User("102",
                "Ali",
                "ali@gmail.com",
                19));

        users.add(new User("103",
                "Sara",
                "sara@gmail.com",
                21));

        // Find youngest user using Stream API

        User youngest = users.stream()
                .min(Comparator.comparing(User::getAge))
                .get();

        System.out.println("Youngest User:");
        System.out.println(youngest);
    }
}