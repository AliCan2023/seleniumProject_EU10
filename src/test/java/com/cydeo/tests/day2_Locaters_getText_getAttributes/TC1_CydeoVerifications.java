package com.cydeo.tests.day2_Locaters_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_CydeoVerifications {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //driver.get("https://practice.cydeo.com");
        driver.navigate().to("https://practice.cydeo.com");




        //verify UR: contains
        //Expected: cydeo;

        String expectedURL ="cydeo";

        //Actual URL
        String actualURL = driver.getCurrentUrl();
       // if (actualURL.contains("cydeo")){

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.err.println("URL verificaiton  FAILED");
        }

        // verify title;
        driver.getTitle();

        // Expected title  "Practice"
        String expectedTitle = "Practice";

        //Actual title
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.err.println("Title verification FAILED");
        }


        driver.close();





    }
}
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
 */
