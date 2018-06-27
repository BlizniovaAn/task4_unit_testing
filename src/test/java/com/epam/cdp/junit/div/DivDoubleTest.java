package com.epam.cdp.junit.div;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class DivDoubleTest extends BaseJUnitTest {

    //Bug!
    @Test(expected = NumberFormatException.class)
    public void divNumberByZeroTest(){
        double actualResult = calculator.div(2.0, 0.0);
    }

    @Test
    public void divPositiveNumbersTest(){
        double actualResult = calculator.div(10.0, 4.0);
        Assert.assertEquals(actualResult, 2.5, 0.0);
    }

    @Test
    public void divNegativeNumbersTest(){
        double actualResult = calculator.div(-2.0, -4.0);
        Assert.assertEquals(actualResult, 0.5, 0.0);
    }

    @Test
    public void divZeroByNumberTest(){
        double actualResult = calculator.div(0.0, 2.0);
        Assert.assertEquals(actualResult, 0.0, 0.0);
    }
    
}
