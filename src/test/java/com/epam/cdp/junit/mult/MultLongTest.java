package com.epam.cdp.junit.mult;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class MultLongTest extends BaseJUnitTest {

    @Test
    public void multPositiveNumbersTest(){
        long actualResult = calculator.mult(1, 2);
        Assert.assertEquals(actualResult, 2);
    }

    @Test
    public void multNegativeNumbersTest(){
        long actualResult = calculator.mult(-1, -2);
        Assert.assertEquals(actualResult, 2);
    }

    @Test
    public void multNumberAndZeroTest(){
        long actualResult = calculator.mult(0, 2);
        Assert.assertEquals(actualResult, 0);
    }

    @Test
    public void multZeroAndZeroTest(){
        long actualResult = calculator.mult(0, 0);
        Assert.assertEquals(actualResult, 0);
    }

}
