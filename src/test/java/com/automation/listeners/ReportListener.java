package com.automation.listeners;

import com.automation.utils.ScreenshotUtils;
import io.qameta.allure.Allure;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportListener implements ITestListener {
    public void onTestSuccess(ITestResult result) {
        Allure.addAttachment("screenshot", ScreenshotUtils.takeScreenshotAsInputStream());
    }

    public void onTestFailure(ITestResult result) {
        Allure.addAttachment("screenshot",ScreenshotUtils.takeScreenshotAsInputStream());
    }
}
