package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenInteger_WhenFirstInteger_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum();
        int maximumInteger = maximum.maxInteger(9,5,2);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenInteger_WhenSecondInteger_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum();
        int maximumInteger = maximum.maxInteger(5,9,2);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenInteger_WhenThirdInteger_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum();
        int maximumInteger = maximum.maxInteger(5,2,9);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenFloat_WhenFirstFloat_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum();
        float maximumFloat = maximum.maxFloat(9.1f,5.1f,2.1f);
        Assert.assertEquals(9.1f, maximumFloat,0.0f);
    }
    @Test
    public void givenFloat_WhenSecondFloat_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum();
        float maximumFloat = maximum.maxFloat(5.1f,9.1f,2.1f);
        Assert.assertEquals(9.1f, maximumFloat,0.0f);
    }
    @Test
    public void givenFloat_WhenThirdFloat_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum();
        float maximumFloat = maximum.maxFloat(5.1f,2.1f,9.1f);
        Assert.assertEquals(9.1f, maximumFloat,0.0f);
    }
}
