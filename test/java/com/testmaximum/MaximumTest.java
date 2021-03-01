package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenInteger_WhenFirstInteger_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum(9,5,2);
        Object maximumInteger = maximum.testMethod();
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenInteger_WhenSecondInteger_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum(5,9,2);
        Object maximumInteger = maximum.testMethod();
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenInteger_WhenThirdInteger_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum(5,2,9);
        Object maximumInteger = maximum.testMethod();
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenFloat_WhenFirstFloat_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum(9.1f,5.1f,2.1f);
        Object maximumFloat = maximum.testMethod();
        Assert.assertEquals(9.1f, maximumFloat);
    }
    @Test
    public void givenFloat_WhenSecondFloat_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum(5.1f,9.1f,2.1f);
        Object maximumFloat = maximum.testMethod();
        Assert.assertEquals(9.1f, maximumFloat);
    }
    @Test
    public void givenFloat_WhenThirdFloat_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum(5.1f,2.1f,9.1f);
        Object maximumFloat = maximum.testMethod();
        Assert.assertEquals(9.1f, maximumFloat);
    }
    @Test
    public void givenString_WhenFirstString_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum("Pizza","Burger", "Noodles");
        Object maximumString = maximum.testMethod();
        Assert.assertEquals("Pizza", maximumString);
    }
    @Test
    public void givenString_WhenSecondString_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum("Burger","Pizza", "Noodles");
        Object maximumString = maximum.testMethod();
        Assert.assertEquals("Pizza", maximumString);
    }
    @Test
    public void givenString_WhenThirdString_IsMaxShouldReturnMax(){
        Maximum maximum = new Maximum("Burger","Noodles", "Pizza");
        Object maximumString = maximum.testMethod();
        Assert.assertEquals("Pizza", maximumString);
    }
}
