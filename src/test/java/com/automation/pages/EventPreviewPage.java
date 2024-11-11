package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EventPreviewPage extends BasePage{

    @FindBy(xpath = "//span[text()='Share']")
    WebElement shareBtn;

    @FindBy(xpath = "//button[text()='Done']")
    WebElement doneBtn;

    public boolean isEventPreviewPageDisplayed(){
        try{
            wait.until(ExpectedConditions.visibilityOf(shareBtn));
            return shareBtn.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickDoneBtn(){

            doneBtn.click();
    }
}
