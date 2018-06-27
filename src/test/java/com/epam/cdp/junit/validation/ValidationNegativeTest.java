package com.epam.cdp.junit.validation;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class ValidationNegativeTest extends BaseJUnitTest {

    @Test
    public void isZeroNegativeTest(){
        boolean isNegative = calculator.isNegative(0);
        Assert.assertFalse(isNegative);
    }

    @Test
    public void isPositiveNumberNegativeTest(){
        boolean isNegative = calculator.isNegative(1);
        Assert.assertFalse(isNegative);
    }

    @Test
    public void isNegativeNumberNegativeTest(){
        boolean isNegative = calculator.isNegative(-1);
        Assert.assertTrue(isNegative);
    }

}
