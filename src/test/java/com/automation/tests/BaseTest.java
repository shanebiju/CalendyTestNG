package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    LandingPage landingPage;
    LoginPage loginPage;
    PasswordEnterPage passwordEnterPage;
    HomePage homePage;
    NewEventTypePage newEventTypePage;
    NewEventDetailsPage newEventDetailsPage;
    EventPreviewPage eventPreviewPage;
    @BeforeMethod
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
        landingPage=new LandingPage();
        loginPage=new LoginPage();
        passwordEnterPage=new PasswordEnterPage();
        homePage=new HomePage();
        newEventTypePage=new NewEventTypePage();
        newEventDetailsPage=new NewEventDetailsPage();
        eventPreviewPage=new EventPreviewPage();
    }

    @AfterMethod
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
