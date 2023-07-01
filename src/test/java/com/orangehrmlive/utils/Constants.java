package com.orangehrmlive.utils;

public class Constants {
    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver1.exe";
    public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe";
    public static final String IE_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/IEDriverServer.exe";
    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/configs/configurations.properties";
    public static final long IMPLICIT_WAIT_TIME = 10;
    public static final long EXPLICIT_WAIT_TIME = 20;
    public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "/screenshots";

}
