package com.Anudip;
import java.util.HashMap;

public class HashMap1 {
        public static void main(String[] args) {
            // Create a HashMap with String keys and Integer values
            HashMap<String, Integer> hashMap = new HashMap<>();

            // Add elements to the HashMap
            hashMap.put("One", 1);
            hashMap.put("Two", 2);
            hashMap.put("Three", 3);
            hashMap.put("Four", 4);

            // Print the HashMap
            System.out.println("HashMap before adding the specified key-value pair:");
            System.out.println(hashMap);

            // Specify the key and value to be added
            String keyToAdd = "Five";
            int valueToAdd = 5;

            // Associate the specified value with the specified key in the HashMap
            hashMap.put(keyToAdd, valueToAdd);

            // Print the HashMap after adding the specified key-value pair
            System.out.println("\nHashMap after adding the specified key-value pair:");
            System.out.println(hashMap);
        }
    }