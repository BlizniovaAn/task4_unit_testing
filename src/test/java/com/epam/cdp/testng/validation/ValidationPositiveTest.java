package com.epam.cdp.testng.validation;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationPositiveTest extends BaseTestNGTest{

    @Test(groups = "P0", testName = "isNegativeTest", description = "Verifies if 0 is positive")
    public void isZeroPositiveNumberTest(){
        boolean isPositive = calculator.isPositive(0);
        Assert.assertFalse(isPositive);
    }

    @Test(groups = "P0", testName = "isPositiveNumberPositiveTest", description = "Verifies if positive number is positive")
    public void isPositiveNumberPositiveTest(){
        boolean isPositive = calculator.isPositive(1);
        Assert.assertTrue(isPositive);
    }

    @Test(groups = "P0", testName = "isNegativeNumberPositiveTest", description = "Verifies if negative number is positive")
    public void isNegativeNumberPositiveTest(){
        boolean isPositive = calculator.isPositive(-1);
        Assert.assertFalse(isPositive);
    }
}
