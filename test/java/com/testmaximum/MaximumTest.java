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
}
