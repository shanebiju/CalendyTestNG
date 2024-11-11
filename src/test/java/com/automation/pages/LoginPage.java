package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@type='email']")
    WebElement emailInput;

    @FindBy(xpath = "//span[@class='sc-7ea76258-0 gimHky' and text()='Log in']")
    WebElement loginBtn;

    public boolean isLoginPageDisplayed(){
        try{
            return emailInput.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void enterEmail(){
        emailInput.sendKeys(ConfigReader.getConfigValue("user.email"));
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

}
