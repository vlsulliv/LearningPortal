package com.portal.collections;

import org.w3c.dom.Node;

import java.util.*;

/**
 * Java program to demonstrate the collection framework. Collection interface (java.util.Collection)
 * and Map interface (java.util.Map) are the two main "root" interfaces of Java Collection Classes.
 *
 * https://imgpile.com/i/Tk508P
 *
 * @author vincent sullivan
 */
public class Collections {

    /* ... */

    public static void main(String[] args) {
        /** Create instances of Array, Vector, and Hashtable */
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> ht = new Hashtable<>();

        /** Adding elements to vector */
        v.add(1);
        v.addElement(4);
        v.addElement(5);

        /** Adding elements to hashtable */
        ht.put(1, "one");
        ht.put(2, "two");

        /** Accessing elements */
        int arrSize = arr.length;
        System.out.println("size of array : " + arrSize);
        System.out.println("value of array index zero : " + arr[0]);
        System.out.println("value of vector index zero : " + v.elementAt(0));
        System.out.println("value corresponding to key 1 in hashtable : " + ht.get(1));


        /**
         * working with vector
         */
        System.out.println("====================================");
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 1; i <= 5; i++ )
            vector.add(i);

        // Print elements
        System.out.println(vector);

        // remove element at index 3
        vector.remove(3);

        // Printing elements after removal
        System.out.println(vector);

        // print element one by one
         for (int i = 0; i < vector.size(); i++)
             System.out.println(vector.get(i) + " ");

        System.out.println("====================================");
        /**
         *
         * Stack
         *
         *  Stack is a subclass of Vector and a legacy class. It is thread-safe which might be overhead
         *  in an environment where thread safety is not needed. An alternate to Stack is to use 'ArrayDequeue'
         *  which is not thread-safe and has faster array implementation.
         */
        Stack<String> stack = new Stack<String>();
        stack.push("uno");
        stack.push("dos");
        stack.push("tres");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // printing the stack
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
        /**
         * Queue Interface
         *
         * Queue Interface: As the name suggests, a queue interface maintains the FIFO(First In First Out) order
         * similar to a real-world queue line. This interface is dedicated to storing all the elements where the
         * order of the elements matter.
         */
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
        System.out.println("====================================");
        /**
         * Set Interface
         *
         * Set Interface: A set is an unordered collection of objects in which duplicate values cannot be stored.
         * This collection is used when we wish to avoid the duplication of the objects and wish to store only the
         * unique objects. This set interface is implemented by various classes like HashSet, TreeSet, LinkedHashSet,
         * etc. Since all the subclasses implement the set, we can instantiate a set object with any of these classes.
         *
         * Refer to <a href="https://www.geeksforgeeks.org/set-in-java/">Set Interface</a>
         *
         */

        /** Set<T> hs = new HashSet<>(); */

        HashSet<String> hs = new HashSet<String>();
        hs.add("in");
        hs.add("god");
        hs.add("we");
        hs.add("trust");

        // traversing elements
        Iterator<String> itra = hs.iterator();
        while (itra.hasNext()) {
            System.out.println(itra.next());
        }
        System.out.println("====================================");
        /**
         * ArrayList
         *
         * ArrayList class is a resizable array, which can be found in the java.util package.
         * <p>
         * difference between a built-in array and an ArrayList in Java, is that the size of
         * an array cannot be modified (if you want to add or remove elements to/from an array,
         * you have to create a new one). While elements can be added and removed from an
         * ArrayList whenever you want.
         * </p>
         *
         * only stores referece data types
         */
        ArrayList<Integer> numList = new ArrayList<Integer>();
        // Method to add objects to arrayList, removes one element, and prints results
        for (Integer i = 0; i < 5; i++)

            // adding Integers to arrayList
            numList.add(i);

        // Print ArrayList
        System.out.println(numList);

        // Remove Integer at index three
        numList.remove(3);

        // Verify index is removed
        System.out.println(numList);

        // Print values one by one
        for (int i = 0; i < numList.size(); i++)
            System.out.print(numList.get(i) + " ");
        System.out.println("====================================");
        /**
         * LinkedList
         *
         * A linked list is a typical information structure that is made of a chain of nodes. Every node contains a
         * value and a pointer to the following node. Connected records can powerfully increment in size. It is also
         * easy to insert and erase from a linked list.
         */
        Node head = null;
        Node next;
        LinkedList linkedlist = new LinkedList();

        /** public void push() { } */

    }
}
