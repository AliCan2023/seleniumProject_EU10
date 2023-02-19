package com.cydeo.utilities;
/*
in this class only general utility methods not related to some specific page;
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtility {

    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
           // throw new RuntimeException(e);
        }

    }
      /*
    This method will accept int(in seconds) and execute Thread.sleep
    for given duration
//Method info:
//• Name: switchWindowAndVerify
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String expectedInUrl: for verify if the url contains given string.
    // If condition matches, it will break the loop.
//• Arg3: String expectedTitle: to be compared against actualTitle.
       */

    public static void switchWindowAndVerify(WebDriver driver,String expectedInURL,String expectedInTitle){
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachHandle : allWindowHandles) {
            driver.switchTo().window(eachHandle);
            System.out.println("Current URL: " + driver.getCurrentUrl());
            // System.out.println("eachHandle = " + eachHandle);

            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }
        // 5. Assert:Title contains expectedTitle;
        String actualTitle = driver.getTitle();
        //String expectedInTitle="Etsy";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /*
    This method accepts  a String "expectedTitle" and Asserts if it is true;
     */
    public static void verifyTitle(WebDriver driver,String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }


    //creating a utility method for ExplicitWait so that we don't have to repeat the lines;
    public static void waitForInvisibilityOf(WebElement webElement){

        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}
/*
TC #2: Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called,it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
 */
