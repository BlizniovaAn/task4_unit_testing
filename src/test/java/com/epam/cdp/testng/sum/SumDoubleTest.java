package com.epam.cdp.testng.sum;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseTestNGTest {

    @Test(groups = "P0", testName = "sumZeroAndZeroTest", description = "Calculate sum of zero and zero double values")
    public void sumPositiveNumbersTest(){
        double actualResult = calculator.sum(1.0, 2.0);
        Assert.assertEquals(actualResult, 3.0);
    }

    @Test(groups = "P0", testName = "sumZeroAndZeroTest", description = "Calculate sum of negative values")
    public void sumNegativeNumbersTest(){
        double actualResult = calculator.sum(-1.0, -2.0);
        Assert.assertEquals(actualResult, -3.0);
    }

    @Test(groups = "P0", testName = "sumZeroAndZeroTest", description = "Calculate sum of number and zero double values")
    public void sumNumberAndZeroTest(){
        double actualResult = calculator.sum(0.0, 2.0);
        Assert.assertEquals(actualResult, 2.0);
    }

    @Test(groups = "P0", testName = "sumZeroAndZeroTest", description = "Calculate sum of zero and zero double values")
    public void sumZeroAndZeroTest(){
        double actualResult = calculator.sum(0.0, 0.0);
        Assert.assertEquals(actualResult, 0.0);
    }

}
