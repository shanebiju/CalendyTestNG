package com.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class ScreenshotUtils {

    public static ByteArrayInputStream takeScreenshotAsInputStream(){
        TakesScreenshot ts=(TakesScreenshot) DriverManager.getDriver();
        byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        return new ByteArrayInputStream(screenshot);
    }
}
