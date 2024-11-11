package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEventDetailsPage extends BasePage{

    @FindBy(xpath = "//input[@name='name']")
    WebElement nameInput;

    @FindBy(xpath = "//p[text()='Phone call']")
    WebElement phoneCallBtn;

    @FindBy(xpath = "//span[text()='Update']")
    WebElement updateBtn;

    @FindBy(xpath = "//h1[text()='New Event Type']")
    WebElement newEventType;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement continueBtn;

    public boolean isNewEvenDetailsPageDisplayed(){
        try{
            return newEventType.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void enterEventName(){
        nameInput.sendKeys(ConfigReader.getConfigValue("event.name"));
    }

    public void clickPhoneOption(){
        phoneCallBtn.click();
    }

    public void clickUpdateBtn(){
        updateBtn.click();
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }
}
