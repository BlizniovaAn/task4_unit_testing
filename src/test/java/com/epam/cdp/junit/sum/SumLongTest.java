package com.epam.cdp.junit.sum;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class SumLongTest extends BaseJUnitTest {

    @Test
    public void sumPositiveNumbersTest(){
        long actualResult = calculator.sum(1, 2);
        Assert.assertEquals(actualResult, 3);
    }

    @Test
    public void sumNegativeNumbersTest(){
        long actualResult = calculator.sum(-1, -2);
        Assert.assertEquals(actualResult, -3);
    }

    @Test
    public void sumNumberAndZeroTest(){
        long actualResult = calculator.sum(0, 2);
        Assert.assertEquals(actualResult, 2);
    }

    @Test
    public void sumZeroAndZeroTest(){
        long actualResult = calculator.sum(0, 0);
        Assert.assertEquals(actualResult, 0);
    }

}
