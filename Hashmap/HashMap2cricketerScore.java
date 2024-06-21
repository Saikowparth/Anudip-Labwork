package com.Anudip;
import java.util.HashMap;
import java.util.Map;
public class HashMap2cricketerScore {
        public static void main(String[] args) {
            // Create a Map to store cricketer names and their scores
            Map<String, Integer> cricketerScores = new HashMap<>();

            // Add cricketers and their scores to the map
            cricketerScores.put("Virat Kohli", 75);
            cricketerScores.put("Rohit Sharma", 102);
            cricketerScores.put("Steve Smith", 56);
            cricketerScores.put("Kane Williamson", 88);

            // Search for a batsman name
            String batsmanName = "Virat Kohli";
            if (cricketerScores.containsKey(batsmanName)) {
                // Display the batsman's score if found
                int score = cricketerScores.get(batsmanName);
                System.out.println(batsmanName + "'s score is: " + score);
            } else {
                // Display a message if the batsman is not found
                System.out.println("Batsman " + batsmanName + " not found in the records.");
            }
        }
    }