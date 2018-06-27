package com.epam.cdp.junit.validation;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class ValidationPositiveTest extends BaseJUnitTest{

    @Test
    public void isZeroPositiveNumberTest(){
        boolean isPositive = calculator.isPositive(0);
        Assert.assertFalse(isPositive);
    }

    @Test
    public void isPositiveNumberPositiveTest(){
        boolean isPositive = calculator.isPositive(1);
        Assert.assertTrue(isPositive);
    }

    @Test
    public void isNegativeNumberPositiveTest(){
        boolean isPositive = calculator.isPositive(-1);
        Assert.assertFalse(isPositive);
    }

}
