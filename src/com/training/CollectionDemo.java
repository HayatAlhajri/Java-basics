package com.training;

import java.util.*;
import java.util.Map.Entry;

public class CollectionDemo {

    public static void main(String[] args) {

        // TreeSet with User + sorting by NameComparator
        Set<User> userSet = new TreeSet<>(new NameComparator());

        User user1 = new User("A101", "Yamama", "abc@gmail.com");
  

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);

        System.out.println("Users sorted by name:");

        for (User user : userSet) {
            System.out.println(user);
        }


        List<User> userList = new ArrayList<>(userSet);

        Collections.sort(userList, new NameComparator());

        System.out.println("\nSorted List:");
        for (User user : userList) {
            System.out.println(user);
        }
        Map<Integer,String> namesMap = new HashMap	<>();
        namesMap.put(101, "Sara");
        namesMap.put(101, "ibrahim");
        namesMap.put(101, "Sayyed");
        namesMap.put(101, "zubaida");
        System.out.println(namesMap.get(103));
        for (Entry<Integer, String> entry:namesMap.entrySet()) {
        	System.out.println(entry.getKey()+":"+entry.getValue());
        }
        
    }
    
}