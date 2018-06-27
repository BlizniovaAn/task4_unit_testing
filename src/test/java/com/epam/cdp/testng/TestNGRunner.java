package com.epam.cdp.testng;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestNGRunner {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("testSuit");
        xmlSuite.setParallel(XmlSuite.ParallelMode.METHODS);
        xmlSuite.setThreadCount(3);
        xmlSuite.setSuiteFiles(Arrays.asList("./src/test/resources/testng.xml"));

        List<XmlSuite> suiteList = new ArrayList<>();
        suiteList.add(xmlSuite);
        testNG.run();
    }
}
