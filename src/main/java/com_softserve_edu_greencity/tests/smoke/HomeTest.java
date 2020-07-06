package com_softserve_edu_greencity.tests.smoke;

import com_softserve_edu_greencity.user_interface.locators.WelcomeBackLocator;
import com_softserve_edu_greencity.user_interface.pageObjects.home.Home;
import com_softserve_edu_greencity.user_interface.locators.TopPartLocator;
import com_softserve_edu_greencity.tests.Runner;
import com_softserve_edu_greencity.user_interface.pageObjects.welocomBack.WelcomeBack;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeTest extends Runner {
    Home home;

    @BeforeClass
    public void before() {
        home = new Home(driver);
    }

    @Test(dataProvider = "all_TopPartLocator_elements")
    public void checkTopPartElements(TopPartLocator locator) {
        Assert.assertEquals(driver.findElements(locator.path()).size(), 1, "Problem with " + locator.name());
    }

    @Test(dataProvider = "all_TopPartLocator_elements")
    public void clickSigninAndReturn(TopPartLocator locator) {
        home = home.checkLogoutMode()
                .clickSignIn()
                .closeToHome();
        Assert.assertEquals(driver.findElements(locator.path()).size(), 1, "Problem with " + locator.name());

    }

    @DataProvider(name = "all_TopPartLocator_elements")
    public Object[] allTopPartLocators() {
        return TopPartLocator.class.getEnumConstants();
    }


}
