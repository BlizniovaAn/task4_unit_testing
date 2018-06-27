package com.epam.cdp.junit.sub;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class SubDoubleTest extends BaseJUnitTest{

    @Test
    public void subPositiveNumbersTest(){
        double actualResult = calculator.sub(2.0, 1.0);
        Assert.assertEquals(actualResult, 1.0, 0.0);
    }

    @Test
    public void subNegativeNumbersTest(){
        double actualResult = calculator.sub(-1.0, -2.0);
        Assert.assertEquals(actualResult, 1.0, 0.0);
    }

    @Test
    public void subZeroAndNumberTest(){
        double actualResult = calculator.sub(0.0, 2.0);
        Assert.assertEquals(actualResult, -2.0, 0.0);
    }

    @Test
    public void subZeroAndZeroTest(){
        double actualResult = calculator.sub(0.0, 0.0);
        Assert.assertEquals(actualResult, 0.0, 0.0);
    }

}
