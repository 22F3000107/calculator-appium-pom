package com.calculator.config;

public class TestConfig {

    // Device / platform config
    public static final String PLATFORM_NAME = "Android";
    public static final String DEVICE_NAME = "Pixel 9a";
    public static final String PLATFORM_VERSION = "16";

    // App under test (built-in calculator)
    public static final String APP_PACKAGE = "com.google.android.calculator";
    public static final String APP_ACTIVITY = "com.android.calculator2.Calculator";

    // Appium server
    public static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723/wd/hub";

    // Example creds/constants (if later needed)
    public static final String DUMMY_USERNAME = "testuser";
    public static final String DUMMY_PASSWORD = "password123";
}