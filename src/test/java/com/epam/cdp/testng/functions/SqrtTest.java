package com.epam.cdp.testng.functions;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTestNGTest{

    //bug!
    @Test(groups = "P0", testName = "sqtrNegativeNumberTest")
    public void sqtrNegativeNumberTest(){
        boolean isNaN = Double.isNaN(calculator.sqrt(-4.0));
        Assert.assertTrue(isNaN, "Verifies sqrt computation of -4.0 = NaN");
    }

    @Test(groups = "P0", testName = "sqtrPositiveNumberTest")
    public void sqtrPositiveNumberTest(){
        double actualValue = calculator.sqrt(4.0);
        Assert.assertEquals(actualValue, 2.0, "Verifies sqrt computation of 4.0 = 2");
    }

}
