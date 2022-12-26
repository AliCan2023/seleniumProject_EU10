package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1-setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create the instance of the selenium WebDriver;
        // This is the line opening an empty browser;
        WebDriver driver = new ChromeDriver();

        //This line will maximize/full screen the browser size;
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //getTitle is gto get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL using Selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back;
        driver.navigate().back();

        // use selenium to navigate forward;
        driver.navigate().forward();

        //stop code execution for 4 seconds
        Thread.sleep(4000);

        // use selenium to navigate refresh;
        driver.navigate().refresh();

        //stop code execution for 4 seconds
        Thread.sleep(4000);

        //use navigate().to();
        driver.navigate().to("https://www.google.com");
        //get the current title after getting the google page;
        currentTitle = driver.getTitle();


        //getTitle is gto get the title of the page

        //String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // System.out.println("driver.getTitle() = " + driver.getTitle());// Google;

        // Get the current URL using Selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // This will close the currently opened windows;
        driver.close();

        // This one will close all of opened windows;
        //driver.quit(); kill the session;


    }


}
