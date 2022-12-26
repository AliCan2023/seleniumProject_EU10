package com.cydeo.tests.day2_Locaters_getText_getAttributes.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException {


        //TC #3: Back and forth navigation
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right. //I located the element using className: class"gb_j"
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        gmailLink.click();
        Thread.sleep(Long.parseLong("3000"));

        //WebElement clickGmail = driver.findElement(By.className("gb_j"));
        //clickGmail.click();

        // 4- Verify title contains:
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification is PASSED!");
        } else {
            System.err.println("Title verification is FAILED!");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:
        //Expected: Google
        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("Title1 verification is PASSED! ");
        } else {
            System.err.println("Title1 verification is FAILED!");
        }
        driver.close();

    }
}
