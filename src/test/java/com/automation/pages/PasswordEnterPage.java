package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PasswordEnterPage extends BasePage{

    @FindBy(xpath = "//label[text()='Enter your password']")
    WebElement passwordLabel;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement continueBtn;

    public boolean isPasswordPageDisplayed(){
        try{
            return passwordLabel.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void enterPassword(){
        passwordInput.sendKeys(ConfigReader.getConfigValue("user.password"));
    }

    public void clickContinue(){
        continueBtn.click();
    }

}
