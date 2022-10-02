package com.portal.collections;

import com.portal.utility.ReadFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
/**
 * `Maps`
 *
 * A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key
 * and null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.
 * The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap have predictable
 * orders, while HashMap does not.
 * There are two interfaces for implementing Map in java. They are Map and SortedMap, and three classes: HashMap,
 * TreeMap, and LinkedHashMap.
 *
 */

public class Map {
    Map hm = new Map();
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * Creating an empty HashMap
         *
         * elements are stored unordered
         */
        HashMap<String, Integer> map = new HashMap<>();
        /**
         * Inserting entries in the Map
         * using put() method
         */
        System.out.println("=============================");
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterating over Map
        for (java.util.Map.Entry<String, Integer> e : map.entrySet())
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
        System.out.println("=============================");
        /**
         *
         * `TreeMap`
         *
         * The map is sorted according to the natural ordering of its keys, or by a Comparator
         * provided at map creation time, depending on which constructor is used.
         *
         * elements are stored unordered
         */
        TreeMap<Integer, Boolean> treeM = new TreeMap<>();
        treeM.put(1, true);
        treeM.put(2, false);

        /** print the key-value pairs */
        System.out.println(treeM.entrySet());

        /** access value associated with key  */
        System.out.println(treeM.get(1));

        System.out.println("=============================");
        /**
         * LinkedHashMap
         *
         * Creating an empty LinkedHashMap
         *
         */
        LinkedHashMap linkM = new LinkedHashMap<Integer, Boolean>();
        linkM.put(1, false);
        linkM.put(2, false);
        linkM.put(3, false);

        /** print keys and values */
        System.out.println(linkM.entrySet());

        /** print number of entries */
        System.out.println(linkM.size());

        /** print only keys */
        System.out.println(linkM.keySet());

    }
}
