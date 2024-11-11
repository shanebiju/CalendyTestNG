package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage{

    @FindBy(xpath = "//span[text()='Get started']")
    WebElement getStartedBtn;

    @FindBy(xpath = "//span[text()='Log In']")
    WebElement loginBtn;

    public void openWebsite(){
        driver.get(ConfigReader.getConfigValue("application.url"));
    }

    public boolean isLandingPageDisplayed(){
        try{
            wait.until(ExpectedConditions.visibilityOf(getStartedBtn));
            return getStartedBtn.isDisplayed();
        } catch (Exception e) {
            return  false;
        }
    }

    public void clickLogin(){
        loginBtn.click();
    }

}
