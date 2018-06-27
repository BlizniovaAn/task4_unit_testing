package com.epam.cdp.junit.div;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class DivLongTest extends BaseJUnitTest{

    @Test(expected = NumberFormatException.class)
    public void divNumberByZeroTest(){
        long actualResult = calculator.div(2, 0);
    }

    @Test
    public void divPositiveNumbersTest(){
        long actualResult = calculator.div(4, 2);
        Assert.assertEquals(actualResult, 2);
    }

    @Test
    public void divNegativeNumbersTest(){
        long actualResult = calculator.div(-2, -4);
        Assert.assertEquals(actualResult, 0);
    }

    @Test
    public void divZeroByNumberTest(){
        long actualResult = calculator.div(0, 2);
        Assert.assertEquals(actualResult, 0);
    }

}
