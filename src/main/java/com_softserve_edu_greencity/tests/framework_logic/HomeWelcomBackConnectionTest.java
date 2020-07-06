package com_softserve_edu_greencity.tests.framework_logic;

import com_softserve_edu_greencity.tests.Runner;
import com_softserve_edu_greencity.user_interface.locators.TopPartLocator;
import com_softserve_edu_greencity.user_interface.pageObjects.home.Home;
import com_softserve_edu_greencity.user_interface.pageObjects.welocomBack.WelcomeBack;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWelcomBackConnectionTest extends Runner {
    Home home;
    WelcomeBack welcomeBack;

    @Test(dataProvider = "allElementsFrom_TopPart_LogoutMode")
    public void fromHomeToWelcomeBackAndReturnTest(TopPartLocator locator) {
        home = new Home(driver);
        welcomeBack = home.checkLogoutMode().clickSignIn();
        home = welcomeBack.closeToHome();
        Assert.assertEquals(driver.findElements(locator.path()).size(), 1);
    }

    @DataProvider(name = "allElementsFrom_TopPart_LogoutMode")
    public Object[] getTopPartLogoutModeElements() {
        return TopPartLocator.values();
    }
}
