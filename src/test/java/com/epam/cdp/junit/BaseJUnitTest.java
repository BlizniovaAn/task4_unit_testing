package com.epam.cdp.junit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseJUnitTest {

    protected static Calculator calculator;

    @BeforeClass
    public static void setUp(){
        calculator = new Calculator();
    }

    @AfterClass
    public static void cleanUp(){
        calculator = null;
    }
}
