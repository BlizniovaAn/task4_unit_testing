package com.epam.cdp.junit.pow;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class PowTest extends BaseJUnitTest {

    @Test
    public void powPositiveNumbersTest(){
        double actualResult = calculator.pow(2.0, 4.0);
        Assert.assertEquals(actualResult, 16.0, 0.0);
    }

    @Test
    public void powNumberToZeroTest(){
        double actualResult = calculator.pow(2.0, 0.0);
        Assert.assertEquals(actualResult, 1.0, 0.0);
    }

    @Test
    public void powZeroToZeroTest(){
        double actualResult = calculator.pow(0.0, 0.0);
        Assert.assertEquals(actualResult, 1.0, 0.0);
    }

}
