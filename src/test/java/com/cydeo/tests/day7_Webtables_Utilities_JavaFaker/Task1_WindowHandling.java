package com.cydeo.tests.day7_Webtables_Utilities_JavaFaker;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_WindowHandling {

    public WebDriver driver;

    ////1. Create new test and make setups
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
    }

    @Test
    public void window_handling_test(){

        //2. Goto:https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        
        //4. Create a logic to switch to the tab where Etsy.com is open
        BrowserUtility.switchWindowAndVerify(driver,"etsy","Etsy");
        /*Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachHandle : allWindowHandles) {
            driver.switchTo().window(eachHandle);
           System.out.println("Current URL: " + driver.getCurrentUrl());
           // System.out.println("eachHandle = " + eachHandle);

            if (driver.getCurrentUrl().contains("etsy")){
                break;
            }
        }

         */
        // 5. Assert:Title contains“Etsy”

        BrowserUtility.verifyTitle(driver,"Etsy Turkey");


       /* String actualTitle = driver.getTitle();
        String expectedInTitle="Etsy";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        */


    }
}
