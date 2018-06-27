package com.epam.cdp.testng.pow;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowTest extends BaseTestNGTest {

    @Test(groups = "P0", testName = "powPositiveNumbersTest")
    public void powPositiveNumbersTest(){
        double actualResult = calculator.pow(2.0, 4.0);
        Assert.assertEquals(actualResult, 16.0);
    }

    @Test(groups = "P0", testName = "powNumberToZeroTest")
    public void powNumberToZeroTest(){
        double actualResult = calculator.pow(2.0, 0.0);
        Assert.assertEquals(actualResult, 1.0);
    }

    @Test(groups = "P0", testName = "powZeroToZeroTest")
    public void powZeroToZeroTest(){
        double actualResult = calculator.pow(0.0, 0.0);
        Assert.assertEquals(actualResult, 1.0);
    }

}
