package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    @FindBy(id = "home-bar-create-button")
    WebElement createBtn;

    @FindBy(xpath = "//div[@class='b72fb0n s6h0q5y']")
    WebElement userProfile;

    @FindBy(xpath = "//div[text()='Logout']")
    WebElement logoutBtn;

    @FindBy(xpath = "//div[text()='Event type']")
    WebElement eventType;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkboxBtn;

    @FindBy(xpath = "//span[text()='Yes']")
    WebElement yesBtn;

    @FindBy(xpath = "//div[text()='Delete']")
    WebElement deletePopUp;

    @FindBy(xpath = "//button[@class='uvkj3lh l15h8fme b1udgwic XlppEtJzRqe4ZPzfkmQT gk3Scw4fj0dWpMqP_ZMg']")
    WebElement settingsBtn;


    public boolean isHomePageDisplayed(){
        try{
            wait.until(ExpectedConditions.visibilityOf(createBtn));
            return createBtn.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnUserProfile(){
        userProfile.click();
    }

    public void clickLogout(){
        logoutBtn.click();
    }

    public void clickCreateBtn(){
        createBtn.click();
    }

    public void clickEventType(){
        eventType.click();
    }

    public boolean isNewEventCreated(){
        try{
            WebElement eventName=driver.findElement(By.xpath("//h2[text()='"+ ConfigReader.getConfigValue("event.name") +"']"));
            return eventName.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void deleteNewEvent(){
        try{
            settingsBtn.click();
            deletePopUp.click();
            yesBtn.click();
            Thread.sleep(7000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
