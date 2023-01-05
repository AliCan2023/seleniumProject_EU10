package com.cydeo.tests.day4_findElements_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task6_StaleElementReferenceException {
    public static void main(String[] args) {

        //TC #6: StaleElementReferenceException
        // Task 1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/abtest
        WebDriver driver = WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");

        // 3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());//true;

        // 4- Refresh the page.
        driver.navigate().refresh();
        //we are refreshing the web element reference by re-assigning (re-locating) the WebElement to get rid of the Stale Element reference Exception;
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        //5- Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());//true;
        //This is a simple StaleElementReferenceException to understand what is this exception and how to handle it.




    }
}
