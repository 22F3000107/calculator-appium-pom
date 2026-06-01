package com.calculator.tests;

import com.calculator.config.DriverManager;
import com.calculator.pages.CalculatorPage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private AndroidDriver driver;
    private CalculatorPage calculatorPage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        calculatorPage = new CalculatorPage(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverManager.quitDriver();
    }

    @Test
    public void testAddition() {
        String actual = calculatorPage.add(7, 3);
        Assert.assertEquals(actual, "10", "Addition result is incorrect");
    }

    @Test
    public void testSubtraction() {
        String actual = calculatorPage.subtract(10, 4);
        Assert.assertEquals(actual, "6", "Subtraction result is incorrect");
    }

    @Test
    public void testMultiplication() {
        String actual = calculatorPage.multiply(5, 6);
        Assert.assertEquals(actual, "30", "Multiplication result is incorrect");
    }

    @Test
    public void testDivision() {
        String actual = calculatorPage.divide(20, 4);
        Assert.assertEquals(actual, "5", "Division result is incorrect");
    }
}