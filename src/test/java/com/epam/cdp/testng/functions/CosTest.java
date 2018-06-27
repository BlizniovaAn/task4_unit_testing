package com.epam.cdp.testng.functions;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosTest extends BaseTestNGTest {

    //Bug!
    @Test(groups = "P0", testName = "cosTest")
    public void cosTest(){
        double actualResult = calculator.cos(0.0);
        Assert.assertEquals(actualResult, 1.0, "Verifies cosine computation of 0.0 radians");

        double actualResult2 = calculator.cos(1.5708);
        Assert.assertEquals(actualResult2, 0, "Verifies cosine computation of 1.570 radians");

        double actualResult3 = calculator.cos(3.1416);
        Assert.assertEquals(actualResult3, -1, "Verifies cosine computation of 3.1416 radians");
    }

}
