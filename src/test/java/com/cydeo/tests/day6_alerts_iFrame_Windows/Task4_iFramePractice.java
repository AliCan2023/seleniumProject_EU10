package com.cydeo.tests.day6_alerts_iFrame_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_iFramePractice {

        WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            //1. Open browser
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //2.Go to: https://practice.cydeo.com/iframe
            driver.get("https://practice.cydeo.com/iframe");

        }

        @Test
        public void iframe_test() {
            // switch driver's focus to iframe;
            // option#1- switching to iframe using id attribute value;
            driver.switchTo().frame("mce_0_ifr");// we also can use index number if we happen to find more than one iframe;

            // locate the page tag
            WebElement yourContentGOesHereText = driver.findElement(By.xpath("//p"));// we could get NoSuchElementException here if  we didn't use switchTo();method to redirect the driver focus to iframe  to locate the element.

            //4. Assert: “Your content goes here.” Text is displayed.
            Assert.assertTrue(yourContentGOesHereText.isDisplayed(),"It doesn't show what we expect...");

            //5. Verify / Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
            //To be able to verify the header , we must switch back to "main HTML".

            driver.switchTo().parentFrame();

            WebElement headerText = driver.findElement(By.xpath("//h3"));// there is only one h3 in this cas;

            // assertion of header text is displayed or not;
            Assert.assertTrue(headerText.isDisplayed());

        }




    }


