package com.Anudip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VegetableList {
    public static void main(String[] args) {
        // Create an ArrayList to store favorite vegetables
        ArrayList<String> vegetables = new ArrayList<>();

        // Add favorite vegetables to the list
        vegetables.add("Carrot");
        vegetables.add("Broccoli");
        vegetables.add("Spinach");
        vegetables.add("Tomato");

        // Display the original list of vegetables
        System.out.println("Original list of vegetables: ");
        displayList(vegetables);

        // Perform operations on the list
        Scanner scanner = new Scanner(System.in);
        Iterator<String> iterator = vegetables.iterator();

        System.out.println("\nEnter 'add' to add a vegetable");
        System.out.println("Enter 'remove' to remove a vegetable");
        System.out.println("Enter 'display' to display the list");
        System.out.println("Enter 'exit' to exit");

        while (iterator.hasNext()) {
            String command = scanner.next();
            switch (command) {
                case "add":
                    System.out.println("Enter the vegetable to add: ");
                    String newVegetable = scanner.next();
                    System.out.println("Enter the index to add the vegetable: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index <= vegetables.size()) {
                        vegetables.add(index, newVegetable);
                        System.out.println(newVegetable + " has been added to the list at index " + index + ".");
                    } else {
                        System.out.println("Invalid index. Please enter a valid index.");
                    }
                    break;
                case "remove":
                    System.out.println("Enter the index of the vegetable to remove: ");
                    index = scanner.nextInt();
                    if (index >= 0 && index < vegetables.size()) {
                        iterator.remove();
                        System.out.println("Vegetable at index " + index + " has been removed.");
                    } else {
                        System.out.println("Invalid index. Please enter a valid index.");
                    }
                    break;
                case "display":
                    System.out.println("Updated list of vegetables: ");
                    displayList(vegetables);
                    break;
                case "exit":
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        }
    }

    // Method to display the list of vegetables
    public static void displayList(ArrayList<String> list) {
        for (String vegetable : list) {
            System.out.println(vegetable);
        }
    }
}
