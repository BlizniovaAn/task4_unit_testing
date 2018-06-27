package com.epam.cdp.testng.functions;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgTest extends BaseTestNGTest {

    //Bug!
    @Test(groups = "P0", testName = "ctgTest")
    public void ctgTest(){
        double actualResult = calculator.ctg(0.5236);
        Assert.assertEquals(actualResult, 1.7320, 0.0001, "Verifies cotangent computation of 0.5236 radians");

        double actualResult2 = calculator.ctg(1.0472);
        Assert.assertEquals(actualResult2, 0.5773, 0.0001, "Verifies cotangent computation of 1.0472 radians");
    }

}
