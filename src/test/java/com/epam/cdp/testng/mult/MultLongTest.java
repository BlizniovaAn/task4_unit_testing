package com.epam.cdp.testng.mult;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultLongTest extends BaseTestNGTest {

    @Test(groups = "P0", testName = "multPositiveNumbersTest", description = "Multiply two positive numbers")
    public void multPositiveNumbersTest(){
        long actualResult = calculator.mult(1, 2);
        Assert.assertEquals(actualResult, 2);
    }

    @Test(groups = "P0", testName = "multNegativeNumbersTest", description = "Multiply two negative numbers")
    public void multNegativeNumbersTest(){
        long actualResult = calculator.mult(-1, -2);
        Assert.assertEquals(actualResult, 2);
    }

    @Test(groups = "P0", testName = "multNumberAndZeroTest", description = "Multiply number and zero value")
    public void multNumberAndZeroTest(){
        long actualResult = calculator.mult(0, 2);
        Assert.assertEquals(actualResult, 0);
    }

    @Test(groups = "P0", testName = "multZeroAndZeroTest", description = "Multiply zero and zero value")
    public void multZeroAndZeroTest(){
        long actualResult = calculator.mult(0, 0);
        Assert.assertEquals(actualResult, 0);
    }

}
