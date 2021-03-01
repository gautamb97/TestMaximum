package com.testmaximum;

public class Maximum {
    public static <T extends Comparable<T>> T maximumValue(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    private static <T> void printMax(T x, T y, T z, T max){
        System.out.println("Maximum integer value is : "+max);
    }

}
