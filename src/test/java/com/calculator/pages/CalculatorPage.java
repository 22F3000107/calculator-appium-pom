package com.calculator.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

public class CalculatorPage {

    private final AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locators – adjust using Appium Inspector content-desc / resource-id
    private WebElement digit(String d) {
        return driver.findElement(MobileBy.AccessibilityId(d)); // e.g. "7"
    }

    private WebElement opPlus() {
        return driver.findElement(MobileBy.AccessibilityId("plus"));
    }

    private WebElement opMinus() {
        return driver.findElement(MobileBy.AccessibilityId("minus"));
    }

    private WebElement opMultiply() {
        return driver.findElement(MobileBy.AccessibilityId("multiply"));
    }

    private WebElement opDivide() {
        return driver.findElement(MobileBy.AccessibilityId("divide"));
    }

    private WebElement equalsBtn() {
        return driver.findElement(MobileBy.AccessibilityId("equals"));
    }

    private WebElement resultField() {
        return driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
    }

    // Generic method to tap digits like "73"
    private void enterNumber(int number) {
        for (char c : String.valueOf(number).toCharArray()) {
            digit(String.valueOf(c)).click();
        }
    }

    public String add(int a, int b) {
        enterNumber(a);
        opPlus().click();
        enterNumber(b);
        equalsBtn().click();
        return resultField().getText();
    }

    public String subtract(int a, int b) {
        enterNumber(a);
        opMinus().click();
        enterNumber(b);
        equalsBtn().click();
        return resultField().getText();
    }

    public String multiply(int a, int b) {
        enterNumber(a);
        opMultiply().click();
        enterNumber(b);
        equalsBtn().click();
        return resultField().getText();
    }

    public String divide(int a, int b) {
        enterNumber(a);
        opDivide().click();
        enterNumber(b);
        equalsBtn().click();
        return resultField().getText();
    }
}