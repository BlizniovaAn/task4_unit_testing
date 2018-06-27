package com.epam.cdp.testng.div;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseTestNGTest {

    //Bug!
    @Test(expectedExceptions = NumberFormatException.class, groups = "P0",
            testName = "divNumberByZeroTest", description = "Divide number by zero value")
    public void divNumberByZeroTest(){
        double actualResult = calculator.div(2.0, 0.0);
    }

    @Test(groups = "P0", testName = "divPositiveNumbersTest", description = "Divide two positive numbers")
    public void divPositiveNumbersTest(){
        double actualResult = calculator.div(10.0, 4.0);
        Assert.assertEquals(actualResult, 2.5);
    }

    @Test(groups = "P0", testName = "divNegativeNumbersTest", description = "Divide two negative numbers")
    public void divNegativeNumbersTest(){
        double actualResult = calculator.div(-2.0, -4.0);
        Assert.assertEquals(actualResult, 0.5);
    }

    @Test(groups = "P0", testName = "divZeroByNumberTest", description = "Divide zero by number value")
    public void divZeroByNumberTest(){
        double actualResult = calculator.div(0.0, 2.0);
        Assert.assertEquals(actualResult, 0.0);
    }
    
}
