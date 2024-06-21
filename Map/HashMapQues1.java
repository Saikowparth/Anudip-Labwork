package com.Anudip;
import java.util.HashMap;
import java.util.Map;
public class HashMapQues1 {
    public static void main(String[] args){
        Map<String, Integer> Employee = new HashMap<String, Integer>();// Creating a Map

        // Adding elements to the map
        Employee.put("Sushil", 1101);
        Employee.put("Kalpak", 1102);
        Employee.put("Rasik", 1103);
        Employee.put("Navin", 1104);
        System.out.println("Map: "+Employee);
        System.out.println();

        System.out.println("Keys: "+Employee.keySet());// Printing the Keys of the map

        System.out.println("Values: "+Employee.values());// Printing the Values of the map

        System.out.println("Entries: "+Employee.entrySet());// Printing the Entries in the map
    }
}
