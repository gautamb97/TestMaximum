package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum maximum = new Maximum();
    @Test
    public void givenInteger_WhenFirstInteger_IsMaxShouldReturnMax(){
        int maximumInteger = maximum.maxInteger(9,5,2);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenInteger_WhenSecondInteger_IsMaxShouldReturnMax(){
        int maximumInteger = maximum.maxInteger(5,9,2);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenInteger_WhenThirdInteger_IsMaxShouldReturnMax(){
        int maximumInteger = maximum.maxInteger(5,2,9);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenFloat_WhenFirstFloat_IsMaxShouldReturnMax(){
        float maximumFloat = maximum.maxFloat(9.1f,5.1f,2.1f);
        Assert.assertEquals(9.1f, maximumFloat,0.0f);
    }
    @Test
    public void givenFloat_WhenSecondFloat_IsMaxShouldReturnMax(){
        float maximumFloat = maximum.maxFloat(5.1f,9.1f,2.1f);
        Assert.assertEquals(9.1f, maximumFloat,0.0f);
    }
    @Test
    public void givenFloat_WhenThirdFloat_IsMaxShouldReturnMax(){
        float maximumFloat = maximum.maxFloat(5.1f,2.1f,9.1f);
        Assert.assertEquals(9.1f, maximumFloat,0.0f);
    }
    @Test
    public void givenString_WhenFirstString_IsMaxShouldReturnMax(){
        String maximumString = maximum.maxString("Pizza","Burger", "Noodles");
        Assert.assertEquals("Pizza", maximumString);
    }
    @Test
    public void givenString_WhenSecondString_IsMaxShouldReturnMax(){
        String maximumString = maximum.maxString("Burger","Pizza", "Noodles");
        Assert.assertEquals("Pizza", maximumString);
    }
}
