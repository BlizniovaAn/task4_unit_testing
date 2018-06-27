package com.epam.cdp.testng.sub;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubLongTest extends BaseTestNGTest{

    @Test(groups = "P0", testName = "subPositiveNumbersTest", description = "Subtraction of two positive numbers")
    public void subPositiveNumbersTest(){
        long actualResult = calculator.sub(2, 1);
        Assert.assertEquals(actualResult, 1);
    }

    @Test(groups = "P0", testName = "subNegativeNumbersTest", description = "Subtraction of two negative numbers")
    public void subNegativeNumbersTest(){
        long actualResult = calculator.sub(-1, -2);
        Assert.assertEquals(actualResult, 1);
    }

    @Test(groups = "P0", testName = "subZeroAndNumberTest", description = "Subtraction of number and zero value")
    public void subZeroAndNumberTest(){
        long actualResult = calculator.sub(0, 2);
        Assert.assertEquals(actualResult, -2);
    }

    @Test(groups = "P0", testName = "subZeroAndZeroTest", description = "Subtraction of zero and zero value")
    public void subZeroAndZeroTest(){
        long actualResult = calculator.sub(0, 0);
        Assert.assertEquals(actualResult, 0);
    }
}
