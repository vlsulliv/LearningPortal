package com.portal.practice;

import java.util.HashMap;

public class Map {
    // Main driver method
    public static void main(String[] args) {
        /**
         * Creating an empty HashMap
         */
        java.util.Map<String, Integer> map = new HashMap<>();
        /**
         * Inserting entries in the Map
         * using put() method
         */
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterating over Map
        for (java.util.Map.Entry<String, Integer> e : map.entrySet())
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}
