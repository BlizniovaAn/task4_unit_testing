package com.epam.cdp.junit.functions;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class CosTest extends BaseJUnitTest {

    //Bug!
    @Test
    public void cosTest(){
        double actualResult = calculator.cos(0.0);
        Assert.assertEquals(actualResult, 1.0, 0.0);

        double actualResult2 = calculator.cos(1.5708);
        org.testng.Assert.assertEquals(actualResult2, 0.0, 0.0);

        double actualResult3 = calculator.cos(3.1416);
        org.testng.Assert.assertEquals(actualResult3, -1.0, 0.0);
    }

}
