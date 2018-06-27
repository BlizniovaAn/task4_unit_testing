package com.epam.cdp.testng.sub;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseTestNGTest{

    @Test(groups = "P0", testName = "subPositiveNumbersTest", description = "Subtraction of two positive numbers")
    public void subPositiveNumbersTest(){
        double actualResult = calculator.sub(2.0, 1.0);
        Assert.assertEquals(actualResult, 1.0);
    }

    @Test(groups = "P0", testName = "subNegativeNumbersTest", description = "Subtraction of two negative numbers")
    public void subNegativeNumbersTest(){
        double actualResult = calculator.sub(-1.0, -2.0);
        Assert.assertEquals(actualResult, 1.0);
    }

    @Test(groups = "P0", testName = "subZeroAndNumberTest", description = "Subtraction of number and zero value")
    public void subZeroAndNumberTest(){
        double actualResult = calculator.sub(0.0, 2.0);
        Assert.assertEquals(actualResult, -2.0);
    }

    @Test(groups = "P0", testName = "subZeroAndZeroTest", description = "Subtraction of zero and zero value")
    public void subZeroAndZeroTest(){
        double actualResult = calculator.sub(0.0, 0.0);
        Assert.assertEquals(actualResult, 0.0);
    }

}
