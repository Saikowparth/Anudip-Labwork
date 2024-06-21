package com.Anudip;
import java.util.Map;
import java.util.TreeMap;
public class HashMapQues2 {
    public static void main(String[]args){
        TreeMap<String, Integer> Anime = new TreeMap<String, Integer>();// Creating TreeMap object

        // Inserting keys and values
        Anime.put("Naruto", 720);
        Anime.put("One Piece", 1108);
        Anime.put("Black Clover", 170);
        Anime.put("HunterXHunter",148);
        Anime.put("Blue Lock",24);
        System.out.println(Anime);
        System.out.println();

        TreeMap<String, Integer> MoreAnime = new TreeMap<String, Integer>();// Creating TreeMap object

        // Inserting keys and values
        MoreAnime.put("Bleach", 366);
        MoreAnime.put("Chainsaw Man", 12);
        MoreAnime.put("Solo Leveling", 12);
        MoreAnime.put("Fighting Spirit", 75);
        System.out.println(MoreAnime);
        System.out.println();

        Anime.putAll(MoreAnime);// Putting elements from one TreeMap to another
        System.out.println(Anime);

        Anime.clear();// Clears the entire Map
        System.out.println(Anime.isEmpty());// Checks whether the Map is empty or not
    }
}
