package com.epam.cdp.junit.functions;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class SqrtTest extends BaseJUnitTest{

    //bug!
    @Test
    public void sqtrNegativeNumberTest(){
        boolean isNaN = Double.isNaN(calculator.sqrt(-4.0));
        Assert.assertTrue(isNaN);
    }

    @Test
    public void sqtrPositiveNumberTest(){
        double actualValue = calculator.sqrt(4.0);
        Assert.assertEquals(actualValue, 2.0, 0.0);
    }

}
