package com_softserve_edu_greencity.user_interface.pageObjects.home;

import com_softserve_edu_greencity.user_interface.pageObjects.PageObject;
import com_softserve_edu_greencity.user_interface.parts.top.TopPart;
import org.openqa.selenium.WebDriver;

/**
 * Main page
 */
public class Home extends PageObject implements TopPart {



    public Home(WebDriver driver) {
        super(driver);
    }








    public LoginMode checkLoginMode() {
        return new LoginMode(getDriver());
    }

    public LogoutMode checkLogoutMode() {
        return new LogoutMode(getDriver());
    }

    public class LoginMode extends Home implements TopPart.LoginMode {

        private LoginMode(WebDriver driver) {
            super(driver);
        }


    }
    public class LogoutMode extends Home implements TopPart.LogoutMode {

        private LogoutMode(WebDriver driver) {
            super(driver);
        }


    }
}
