package com.epam.cdp.testng.functions;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SinTest extends BaseTestNGTest {

    @Test(groups = "P0", testName = "sinTest")
    public void sinTest(){
        double actualResult = calculator.sin(0.0);
        Assert.assertEquals(actualResult, 0.0, 0.0001, "Verifies sin computation of 0.0 radians");

        double actualResult2 = calculator.sin(1.5708);
        Assert.assertEquals(actualResult2, 1.0, 0.001, "Verifies sin computation of 1.5708 radians");

        double actualResult3 = calculator.sin(3.1416);
        Assert.assertEquals(actualResult3, 0.0, 0.001, "Verifies sin computation of 3.1416 radians");
    }

}
