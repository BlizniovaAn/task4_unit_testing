package com.epam.cdp.junit.functions;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class CtgTest extends BaseJUnitTest {

    //Bug!
    @Test
    public void ctgTest(){
        double actualResult = calculator.ctg(0.5236);
        Assert.assertEquals(actualResult, 1.7320, 0.0001);

        double actualResult2 = calculator.ctg(1.0472);
        Assert.assertEquals(actualResult2, 0.5773, 0.0001);
    }

}
