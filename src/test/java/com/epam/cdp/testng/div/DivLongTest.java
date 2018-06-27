package com.epam.cdp.testng.div;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivLongTest extends BaseTestNGTest{

    @Test(expectedExceptions = NumberFormatException.class, groups = "P0",
            testName = "divNumberByZeroTest", description = "Divide number by zero value")
    public void divNumberByZeroTest(){
        long actualResult = calculator.div(2, 0);
    }

    @Test(groups = "P0", testName = "divPositiveNumbersTest", description = "Divide two positive numbers")
    public void divPositiveNumbersTest(){
        long actualResult = calculator.div(4, 2);
        Assert.assertEquals(actualResult, 2);
    }

    @Test(groups = "P0", testName = "divNegativeNumbersTest", description = "Divide two negative numbers")
    public void divNegativeNumbersTest(){
        long actualResult = calculator.div(-2, -4);
        Assert.assertEquals(actualResult, 0);
    }

    @Test(groups = "P0", testName = "divZeroByNumberTest", description = "Divide zero by number value")
    public void divZeroByNumberTest(){
        long actualResult = calculator.div(0, 2);
        Assert.assertEquals(actualResult, 0);
    }

}
