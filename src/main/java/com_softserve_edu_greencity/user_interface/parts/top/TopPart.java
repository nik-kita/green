package com_softserve_edu_greencity.user_interface.parts.top;

import com_softserve_edu_greencity.user_interface.locators.TopPartLocator;
import com_softserve_edu_greencity.user_interface.locators.WelcomeBackLocator;
import com_softserve_edu_greencity.user_interface.pageObjects.welocomBack.WelcomeBack;
import com_softserve_edu_greencity.user_interface.parts.PartInterface;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * This GreenCity Header.
 * Includes all top locators.
 *
 * Navigate buttons:
 *                  'Eco news',
 *                  'Tips & Tricks',
 *                  'Places',
 *                  'About as',
 *                  'My habits'
 * Help buttons:
 *              'Language switcher checkbox',
 *              'Search input'
 *
 *  Authorization buttons:
 *
 *              if user logout:
 *                          'Sign in',
 *                          'Sign up'
 *
 *              else if login:
 *                          'User checkbox'
 *
 *  P. S.
 *  Some locators have different behavior in different user modes (LoginMode or LogoutMode)
 *
 */
public interface TopPart extends PartInterface {


    interface LogoutMode extends TopPart {
        default WelcomeBack clickSignIn() {
            WebElement signInButton = getDriver()
                    .findElement(TopPartLocator.SIGN_IN_BUTTON.path());
            Wait<WebDriver> wait = new WebDriverWait(getDriver(), 5);
            wait.until(ExpectedConditions.visibilityOf(signInButton));
            signInButton.click();

            return new WelcomeBack(getDriver());
        }

    }

    interface LoginMode extends TopPart {


    }

}
