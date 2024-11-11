package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLogoutTest extends BaseTest{
    @Test
    public void verifyLoginLogout(){
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
        homePage.clickOnUserProfile();
        homePage.clickLogout();
        Assert.assertTrue(landingPage.isLandingPageDisplayed());
    }
}
