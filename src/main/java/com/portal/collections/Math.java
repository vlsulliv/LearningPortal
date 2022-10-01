package com.portal.collections;

import io.netty.util.internal.MathUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.core.pattern.NotANumber;

import java.lang.Math.*;
import java.security.SecureRandom;
import java.lang.Object.*;
/**
 * The HelloWorld program implements methods
 * from Java Math class.
 *
 * @author  Vincent
 * @version 1.0
 * @since   2022-09-27
 */
public class Math {
    static int result;
    static double ans;
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
         return result =  StrictMath.abs(numA);
        } else {
            return numA;
        }
    }

    public static double sqrtNum(double numA) {
        double sqrt = StrictMath.sqrt(numA);
        return sqrt;
    }

    public static double logNum(double numA) {
        ans = StrictMath.log(StrictMath.abs(numA));
        return ans;
    }

    public static double maxNum(double numA, double numB) {
        ans = StrictMath.max(numA, numB);
        return ans;
    }

    public static double exp(double numA) {
        ans = StrictMath.exp(numA);
        return ans;
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
