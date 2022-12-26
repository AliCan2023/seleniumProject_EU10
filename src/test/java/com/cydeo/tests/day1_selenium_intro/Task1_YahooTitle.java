package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitle {

    public static void main(String[] args) {

        // set up the driver
        WebDriverManager.chromedriver().setup();

        // set up the browser;
        WebDriver driver = new ChromeDriver();

        // maximize the screen;
        driver.manage().window().maximize();

        // go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //verify the title
        //Expected title: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //Actual title comes from the browser itself;
        String actualTitle = driver.getTitle();
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification is PASSED!");
        }else{
            System.err.println("Title is NOT as expected. Verification is FAILED!");
        }

        driver.quit();






    }
}
/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com
3. Verify title:
Expected: Yahoo
 */