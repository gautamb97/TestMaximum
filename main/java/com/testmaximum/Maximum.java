package com.testmaximum;

public class Maximum {
    public static Integer maxInteger(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMaxInteger(x, y, z, max);
        return max;
    }
    private static void printMaxInteger(Integer x, Integer y, Integer z, Integer max){
        System.out.println("Maximum integer value is : "+max);
    }
}
