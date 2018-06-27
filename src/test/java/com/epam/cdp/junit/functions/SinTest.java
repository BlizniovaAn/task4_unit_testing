package com.epam.cdp.junit.functions;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class SinTest extends BaseJUnitTest {

    @Test
    public void sinTest(){
        double actualResult = calculator.sin(0.0);
        Assert.assertEquals(actualResult, 0.0, 0.0001);

        double actualResult2 = calculator.sin(1.5708);
        Assert.assertEquals(actualResult2, 1.0, 0.001);

        double actualResult3 = calculator.sin(3.1416);
        Assert.assertEquals(actualResult3, 0.0, 0.001);
    }

}
