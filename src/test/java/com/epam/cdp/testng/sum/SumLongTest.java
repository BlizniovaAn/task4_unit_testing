package com.epam.cdp.testng.sum;

import com.epam.cdp.testng.BaseTestNGTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumLongTest extends BaseTestNGTest {

    @Test(dataProvider = "getValuesForSum", groups = "P1", testName = "dataProviderForSumTest", description = "Verifies using dataProvider to sum numbers")
    public void dataProviderForSumTest(long a, long b, long expectedResult){
        long actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "P1", testName = "sumTwoParametrizedValues", description = "Verify parameterized test")
    @Parameters({"a","b","sum"})
    public void sumTwoParametrizedValues(long a, long b, long sum){
        long actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, sum);
    }

    @Test(groups = "P0", testName = "sumPositiveNumbersTest", description = "Calculate sum of two positive numbers")
    public void sumPositiveNumbersTest(){
        long actualResult = calculator.sum(1, 2);
        Assert.assertEquals(actualResult, 3);
    }

    @Test(groups = "P0", testName = "sumNegativeNumbersTest", description = "Calculate sum of two negative numbers")
    public void sumNegativeNumbersTest(){
        long actualResult = calculator.sum(-1, -2);
        Assert.assertEquals(actualResult, -3);
    }

    @Test(groups = "P0", testName = "sumNumberAndZeroTest", description = "Calculate sum of number and zero value")
    public void sumNumberAndZeroTest(){
        long actualResult = calculator.sum(0, 2);
        Assert.assertEquals(actualResult, 2);
    }

    @Test(groups = "P0", testName = "sumZeroAndZeroTest", description = "Calculate sum of zero and zero value")
    public void sumZeroAndZeroTest(){
        long actualResult = calculator.sum(0, 0);
        Assert.assertEquals(actualResult, 0);
    }

    @DataProvider
    private Object[][] getValuesForSum(){
        return new Object[][]{
                {2, 3, 5},
                {1, 1, 2},
                {0, 0, 0}
        };
    }

}
