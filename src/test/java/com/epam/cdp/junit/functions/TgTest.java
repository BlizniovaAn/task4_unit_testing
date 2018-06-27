package com.epam.cdp.junit.functions;

import com.epam.cdp.junit.BaseJUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class TgTest extends BaseJUnitTest {

    //Bug!!
    @Test
    public void tgTest(){
        double actualResult = calculator.tg(0.5236);
        Assert.assertEquals(actualResult, 0.5773, 0.0001);
    }

}
