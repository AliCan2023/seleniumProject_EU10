package com.cydeo.tests.day5_testNG_Intro_dropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //create a browser setup
        //open browser
        driver = WebDriverFactory.getDriver("chrome");

        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void selenium_test() {


        //get "https://goolge.com"
        driver.get("https://google.com");

        //Assert:title is "Google"

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle, "The tile is not matching...");
    }

}
