package com.testmaximum;

public class Maximum <T extends Comparable<T>> {
    T x, y, z;
    public Maximum(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T testMethod(){
        return Maximum.maximumValue(x, y, z);
    }
    public static <T extends Comparable<T>> T maximumValue(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}
