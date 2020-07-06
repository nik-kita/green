package com_softserve_edu_greencity.user_interface.pageObjects;


import com_softserve_edu_greencity.user_interface.pageObjects.home.Home;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public abstract class PageObject {
    private WebDriver driver;


    public static boolean isLogin = false;



    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }





}
