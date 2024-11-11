package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateEventTest extends BaseTest{
    @Test
    public void verifyUserCanCreateEvents(){
        landingPage.openWebsite();
        Assert.assertTrue(landingPage.isLandingPageDisplayed());
        landingPage.clickLogin();
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
        loginPage.enterEmail();
        loginPage.clickLoginBtn();
        Assert.assertTrue(passwordEnterPage.isPasswordPageDisplayed());
        passwordEnterPage.enterPassword();
        passwordEnterPage.clickContinue();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickCreateBtn();
        homePage.clickEventType();
        Assert.assertTrue(newEventTypePage.isNewEventTypePageDisplayed());
        newEventTypePage.clickOneOnOneArrow();
        newEventTypePage.clickNextBtn();
        Assert.assertTrue(newEventDetailsPage.isNewEvenDetailsPageDisplayed());
        newEventDetailsPage.enterEventName();
        newEventDetailsPage.clickPhoneOption();
        newEventDetailsPage.clickUpdateBtn();
        newEventDetailsPage.clickContinueBtn();
        Assert.assertTrue(eventPreviewPage.isEventPreviewPageDisplayed());
        eventPreviewPage.clickDoneBtn();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        Assert.assertTrue(homePage.isNewEventCreated());
        homePage.deleteNewEvent();
    }
}
