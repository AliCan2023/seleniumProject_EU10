package com.cydeo.tests.day2_Locaters_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_linkText_BackNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //driver.get(" ");
        driver.navigate().to("https://practice.cydeo.com");
        //Thread.sleep(3000);

        //Click to A/B Testing from top of the list.
        //driver.findElement(By.linkText("A/B Testing")).click();// we want to store the webElement;
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing")); // locate the webElement and store it;
        abTestLink.click();
        //System.out.println("abTestLink = " + abTestLink);
        Thread.sleep(3000);

        //Verify title is:
        // Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASSED.");
        } else {
            System.err.println("Title verification is FAILED.");
        }
        //Go back to home page by using the .back();
        driver.navigate().back();
        //Verify title equals: Expected: Practice

        String expectedHomePageTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedHomePageTitle)) {
            System.out.println("Title Verification is PASSED.");
        } else {
            System.err.println("Title verification is FAILED.");
        }


    }


}
/*
TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
 4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
 6- Verify title equals:
Expected: Practice
 */