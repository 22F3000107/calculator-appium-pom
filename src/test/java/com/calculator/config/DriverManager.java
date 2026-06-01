package com.calculator.config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    private static AndroidDriver createDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(TestConfig.PLATFORM_NAME);
        options.setDeviceName(TestConfig.DEVICE_NAME);
        options.setPlatformVersion(TestConfig.PLATFORM_VERSION);
        options.setAutomationName("UiAutomator2");
        options.setAppPackage(TestConfig.APP_PACKAGE);
        options.setAppActivity(TestConfig.APP_ACTIVITY);
        options.setAutoGrantPermissions(true);

        try {
            return new AndroidDriver(new URL(TestConfig.APPIUM_SERVER_URL), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Appium server URL", e);
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}