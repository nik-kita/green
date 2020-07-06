package com_softserve_edu_greencity.user_interface.locators;

import com_softserve_edu_greencity.user_interface.pageObjects.PageObject;
import org.openqa.selenium.By;

public enum TopPartLocator implements Locator {
    HEADER(By.cssSelector(".header")),
    IMG_GREENCITY_LOGOTYPE(By.cssSelector("img[src='assets/img/logo_M.png']")),
    ECONEWS_NAVIGATION_BUTTON(By.cssSelector(".navigation-menu-left a[href='#/news']")),
    TIPSandTRICKS_NAVIGATION_BUTTON(By.cssSelector(".navigation-menu-left a[href='#/welcome']")),
    PLACES_NAVIGATION_BUTTON(By.cssSelector(".navigation-menu-left a[href='#/map']")),
    ABOUT_NAVIGATION_BUTTON(By.cssSelector(".navigation-menu-left a[href='#/about']")),
    MY_HABBITS_NAVIGATION_BUTTON(By.cssSelector(".navigation-menu-left a[href='#/profile/not_signed_in']")
    /*TODO add locator for SIGNIN mode*/),
    SEARCH_BUTTON(By.cssSelector("img[alt='search']")),
    LANGUAGE_SWITCHER_BUTTON(By.cssSelector("select.language-switcher")),
    SIGN_IN_BUTTON(By.cssSelector("li.sign-in-link")
    /*TODO SIGNIN mode*/),
    SIGN_UP_BUTTON(By.cssSelector("li.sign-up-link div.create-button")
    /*TODO SIGNIN mode */);

    private By path;

    public By path() {
        return path;
    }

    TopPartLocator(By...path) {
        if(path.length == 0) {
            this.path = path[0];
        } else {
            this.path = PageObject.isLogin ? path[1] : path[0];
        }
    }
}
