package com_softserve_edu_greencity.user_interface.pageObjects.welocomBack;

import com_softserve_edu_greencity.user_interface.locators.TopPartLocator;
import com_softserve_edu_greencity.user_interface.locators.WelcomeBackLocator;
import com_softserve_edu_greencity.user_interface.pageObjects.PageObject;

import com_softserve_edu_greencity.user_interface.pageObjects.home.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Popup window that shows after
 * "Sign in" button click
 * Title : "Welcome back!"
 */
public class WelcomeBack extends PageObject {


    public WelcomeBack(WebDriver driver) {
        super(driver);
    }

    public Home closeToHome() {
        getDriver().findElement(WelcomeBackLocator.UPRIGHT_LITTLE_CLOSE_BUTTON.path()).click();

        return new Home(getDriver());
    }
}
