package com.Anudip;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class Hash_LinkSet {
    public static void main(String[]args){

        Set<String> fruits = new LinkedHashSet<String>();// creating favourite fruits set
        Set<String> vegetables = new LinkedHashSet<String>();// creating favourite vegetables set

        // Adding favourite fruits
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Mango");

        System.out.println("The favourite fruits list: "+fruits);

        // Adding favourite vegetables
        vegetables.add("Cowpeas");
        vegetables.add("Lima beans");
        vegetables.add("Green peas");
        vegetables.add("Spinach");
        vegetables.add("Eggplant");

        System.out.println("The favourite vegetables list: "+vegetables);

        Iterator<String> iterator = fruits.iterator();// Creating iterator object

        // Using iterator to display set elements
        while (iterator.hasNext()){
            String name =iterator.next();
            System.out.println(name);
        }

        // removing a element from set
        fruits.remove("Orange");
        System.out.println("The fruits list after deletion: "+fruits);

        // checking an element in the set
        System.out.println(fruits.contains("Banana"));

    }
}
