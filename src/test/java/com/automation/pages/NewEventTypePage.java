package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEventTypePage extends BasePage{

    @FindBy(xpath = "//h1[text()='Create New Event Type']")
    WebElement createEventType;

    @FindBy(xpath = "//div[@class='yjZc_FVV5nroAkZQiLNu EYV5UO6Ps7INEzsMnmsH']")
    WebElement oneOnOneArrow;

    @FindBy(xpath = "//button/span[text()='Next']")
    WebElement nextBtn;

    public boolean isNewEventTypePageDisplayed(){
        try{
            return createEventType.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOneOnOneArrow(){
        oneOnOneArrow.click();
    }

    public void clickNextBtn(){
        nextBtn.click();
    }


}
