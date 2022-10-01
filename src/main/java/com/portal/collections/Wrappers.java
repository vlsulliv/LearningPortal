package com.portal.collections;

public class Wrappers {
    /**
     * data types: reference and primitive
     *
     * primitives    Wrapper
     * boolean       Boolean
     * char          Character
     * int           Integer
     * double        Double
     *
     */

    static Boolean a = true;
    boolean b = false;

    public static void main(String[] args) {
        System.out.println(a.booleanValue());
        System.out.println(a.equals(a));
    }
}
