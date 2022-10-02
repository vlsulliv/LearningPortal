package com.portal.collections;

/**
 * The HelloWorld program implements methods
 * from Java Math class.
 *
 * @author  Vincent
 * @version 1.0
 * @since   2022-09-27
 */
public class Compute {
    static int result;
    static double ans;
    /**
     * Constants PI and e
     */
    static double PI;
    static double E;

    public static int addNum(int numA, int numB) {
        return result = numA + numB;
    }

    public static int subNum(int numA, int numB) {
        return result = numA + numB;
    }

    public static long multNum(int numA, int numB) {
        return result = numA * numB;
    }

    public static long absNum(int numA) {
        if (numA < 0) {
         return StrictMath.abs(numA);
        } else {
            return numA;
        }
    }
    /**
     * takes number and returns sqrt root
     * @param numA input number
     * @return square root of input number
     */
    public static double sqrtNum(double numA) {
        ans = StrictMath.sqrt(numA);
        return ans;
    }
    /**
     * accepts double as inputl returns natural log.
     * @param numA positive number
     * @return natural log of input `numA`
     */

    public static double logNum(double numA) {
        return StrictMath.log(StrictMath.abs(numA));
    }
    /**
     * compares two numbers and returns the larger value.
     * @param numA double
     * @param numB double
     * @return the larger value of type double.
     */
    public static double maxNum(double numA, double numB) {
        return StrictMath.max(numA, numB);
    }
    /**
     *
     * @param numA
     * @return
     */
    public static double exp(double numA) {
        return StrictMath.exp(numA);
    }
    /**
     *
     * @param NumA
     * @return
     */
    public static double randNum(double NumA) {
        return StrictMath.random();
    }

    public static void main(String[] args) {
        System.out.println(addNum(2,3));
        System.out.println(subNum(2,3));
        System.out.println(multNum(2,3));
        System.out.println(java.lang.Math.PI);
        System.out.println(absNum(-2));
        System.out.println(sqrtNum(64));
        System.out.println(logNum(3));
        System.out.println(E);
        System.out.println(maxNum(29,50));
        System.out.println(exp(23));
    }
}
