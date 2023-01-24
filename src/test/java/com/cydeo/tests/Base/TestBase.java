package com.cydeo.tests.Base;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    //1. Create new test and make setups

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
