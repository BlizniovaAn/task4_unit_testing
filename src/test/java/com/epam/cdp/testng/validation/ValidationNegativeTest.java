package com.epam.cdp.testng.validation;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationNegativeTest extends BaseTestNGTest {

    @Test(groups = "P0", testName = "isZeroNegativeTest", description = "Verifies if 0 is negative")
    public void isZeroNegativeTest(){
        boolean isNegative = calculator.isNegative(0);
        Assert.assertFalse(isNegative);
    }

    @Test(groups = "P0", testName = "isPositiveNumberNegativeTest", description = "Verifies if positive number is negative")
    public void isPositiveNumberNegativeTest(){
        boolean isNegative = calculator.isNegative(1);
        Assert.assertFalse(isNegative);
    }

    @Test(groups = "P0", testName = "isNegativeNumberNegativeTest", description = "Verifies if negative number is negative")
    public void isNegativeNumberNegativeTest(){
        boolean isNegative = calculator.isNegative(-1);
        Assert.assertTrue(isNegative);
    }
}
