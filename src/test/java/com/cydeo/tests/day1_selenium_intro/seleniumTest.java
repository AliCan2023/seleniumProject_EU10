package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    public static void main(String[] args) {
        // 1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- create instance of chrome drivers

        WebDriver driver = new ChromeDriver();
        /*System.setProperty("chrome.binary", "/path/to/chrome");
        WebDriver driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("/path/to/chrome");
       // WebDriver driver = new ChromeDriver(chromeOptions);

         */



        //3- Test if driver is working as expected;

        driver.get("https://www.google.com");


    }
}
