package com.epam.cdp.testng.mult;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseTestNGTest {

    //Bug!
    @Test(groups = "P0", testName = "multPositiveNumbersTest", description = "Multiply two positive numbers")
    public void multPositiveNumbersTest(){
        double actualResult = calculator.mult(1.5, 2.2);
        Assert.assertEquals(actualResult, 3.3);
    }

    @Test(groups = "P0", testName = "multNegativeNumbersTest", description = "Multiply two negative numbers")
    public void multNegativeNumbersTest(){
        double actualResult = calculator.mult(-1.0, -2.0);
        Assert.assertEquals(actualResult, 2.0);
    }

    @Test(groups = "P0", testName = "multNumberAndZeroTest", description = "Multiply number and zero value")
    public void multNumberAndZeroTest(){
        double actualResult = calculator.mult(0.0, 2.0);
        Assert.assertEquals(actualResult, 0.0);
    }

    @Test(groups = "P0", testName = "multZeroAndZeroTest", description = "Multiply zero and zero value")
    public void multZeroAndZeroTest(){
        double actualResult = calculator.mult(0.0, 0.0);
        Assert.assertEquals(actualResult, 0.0);
    }
    
}
