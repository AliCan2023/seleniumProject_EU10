package com.cydeo.tests.day2_Locaters_getText_getAttributes.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {

//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

// 3. Search for “wooden spoon”
        WebElement etsySearchBox = driver.findElement(By.id("global-enhancements-search-query"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

// 4. Verify title:
//Expected: “Wooden spoon | Etsy”

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        //verification title;
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");//checking by Inspect the title should be "Wooden spoon | Etsy"
        }else {

            System.err.println("Title verification is FAILED!");
        }


    }
}
