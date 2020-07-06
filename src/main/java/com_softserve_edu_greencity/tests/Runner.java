package com_softserve_edu_greencity.tests;

import com_softserve_edu_greencity.tests.test_tools.Host;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public abstract class Runner {
    protected WebDriver driver;
    protected Host host;

    @BeforeSuite
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        setup(Host.INTER);

        welcome();
    }



    @AfterClass(alwaysRun = true)
    public void tearDownAfterClass() throws Exception {
        //presentationSleep(2);
        if (driver != null) {
            driver.quit();
        }
    }




    public void setup(Host host) {
        this.host = host;
    }

    public void welcome() {
        driver.get(host.getUrl());
    }



    protected void presentationSleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // For Presentation ONLY
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
