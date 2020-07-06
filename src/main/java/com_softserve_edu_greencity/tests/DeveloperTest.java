package com_softserve_edu_greencity.tests;

import com_softserve_edu_greencity.user_interface.locators.WelcomeBackLocator;
import com_softserve_edu_greencity.user_interface.pageObjects.home.Home;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeveloperTest {
    @Test
    public void className() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println(new Home(driver).getClass().getSimpleName());

    }
}
