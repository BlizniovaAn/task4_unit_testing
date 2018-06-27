package com.epam.cdp.junit.sub;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class SubLongTest extends BaseJUnitTest{

    @Test
    public void subPositiveNumbersTest(){
        long actualResult = calculator.sub(2, 1);
        Assert.assertEquals(actualResult, 1);
    }

    @Test
    public void subNegativeNumbersTest(){
        long actualResult = calculator.sub(-1, -2);
        Assert.assertEquals(actualResult, 1);
    }

    @Test
    public void subZeroAndNumberTest(){
        long actualResult = calculator.sub(0, 2);
        Assert.assertEquals(actualResult, -2);
    }

    @Test
    public void subZeroAndZeroTest(){
        long actualResult = calculator.sub(0, 0);
        Assert.assertEquals(actualResult, 0);
    }
}
