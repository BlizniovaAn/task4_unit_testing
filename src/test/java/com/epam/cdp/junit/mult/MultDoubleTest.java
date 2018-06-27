package com.epam.cdp.junit.mult;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class MultDoubleTest extends BaseJUnitTest {

    //Bug!
    @Test
    public void multPositiveNumbersTest(){
        double actualResult = calculator.mult(1.5, 2.2);
        Assert.assertEquals(actualResult, 3.3, 0.0);
    }

    @Test
    public void multNegativeNumbersTest(){
        double actualResult = calculator.mult(-1.0, -2.);
        Assert.assertEquals(actualResult, 2.0, 0.0);
    }

    @Test
    public void multNumberAndZeroTest(){
        double actualResult = calculator.mult(0.0, 2.0);
        Assert.assertEquals(actualResult, 0.0, 0.0);
    }

    @Test
    public void multZeroAndZeroTest(){
        double actualResult = calculator.mult(0.0, 0.0);
        Assert.assertEquals(actualResult, 0.0, 0.0);
    }
    
}
