package com_softserve_edu_greencity.tests.smoke;

import com_softserve_edu_greencity.tests.Runner;
import com_softserve_edu_greencity.user_interface.locators.WelcomeBackLocator;
import com_softserve_edu_greencity.user_interface.pageObjects.home.Home;
import com_softserve_edu_greencity.user_interface.pageObjects.welocomBack.WelcomeBack;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WelcomeBackTest extends Runner {
    WelcomeBack welcomeBack;
    @BeforeClass
    public void before() {
        welcomeBack = new Home(driver).checkLogoutMode().clickSignIn();

    }

    @Test
    public void openCloseTest() {
        welcomeBack.closeToHome().checkLogoutMode()
                .clickSignIn()
                .closeToHome()
                .checkLogoutMode()
                .clickSignIn()
                .closeToHome()
                .checkLogoutMode()
                .clickSignIn()
                .closeToHome()
                .checkLogoutMode()
                .clickSignIn()
                .closeToHome()
                .checkLogoutMode()
                .clickSignIn();
    }
    @Test(dataProvider = "all_WelcomeBack_elements")
    public void checkWelcomeBackElements(WelcomeBackLocator locator) {
        Assert.assertTrue(driver.findElement(locator.path()).isDisplayed(), "Problem with " + locator.name());
    }

    @DataProvider(name = "all_WelcomeBack_elements")
    public Object[] allWelcomeBackLocators() {
        return WelcomeBackLocator.class.getEnumConstants();
    }
}
