package com.epam.cdp.testng.functions;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgTest extends BaseTestNGTest {

    //Bug!!
    @Test(groups = "P0", testName = "tgTest")
    public void tgTest(){
        double actualResult = calculator.tg(0.5236);
        Assert.assertEquals(actualResult, 0.5773, 0.0001, "Verifies tg computation of 0.5236 radians(30) = 0.5773");
    }

}
