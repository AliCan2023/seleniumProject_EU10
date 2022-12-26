package com.cydeo.tests.day2_Locaters_getText_getAttributes.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) {
        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3. Verify header text
        WebElement headerText = driver.findElement(By.tagName("h3")); //locate the header text and find the web element<h3>Log in to ZeroBank</h3>

        //Expected: “Log in to ZeroBank”
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();

        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Header Text verification is PASSED!");
        }else{
            System.err.println("Header Text verification is FAILED!");
        }




    }
}
