package com.epam.cdp.junit.sum;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class SumDoubleTest extends BaseJUnitTest {

    @Test
    public void sumPositiveNumbersTest(){
        double actualResult = calculator.sum(1.0, 2.0);
        Assert.assertEquals(actualResult, 3.0, 0.0);
    }

    @Test
    public void sumNegativeNumbersTest(){
        double actualResult = calculator.sum(-1.0, -2.0);
        Assert.assertEquals(actualResult, -3.0, 0.0);
    }

    @Test
    public void sumNumberAndZeroTest(){
        double actualResult = calculator.sum(0.0, 2.0);
        Assert.assertEquals(actualResult, 2.0, 0.0);
    }

    @Test
    public void sumZeroAndZeroTest(){
        double actualResult = calculator.sum(0.0, 0.0);
        Assert.assertEquals(actualResult, 0.0, 0.0);
    }

}
