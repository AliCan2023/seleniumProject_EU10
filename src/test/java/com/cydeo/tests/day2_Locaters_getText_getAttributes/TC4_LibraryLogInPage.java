package com.cydeo.tests.day2_Locaters_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_LibraryLogInPage {


    public static void main(String[] args) {

       // TC #4: Library verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");

       // 3. Enter username: “incorrect@email.com”
        WebElement userNameInput = driver.findElement(By.className("form-control"));//only the input tag accepts input from users;
        userNameInput.sendKeys("incorrect@email.com");

       // 4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        //5.click to sign in button;
        WebElement signInButton = driver.findElement(By.tagName("button"));// try to locate use tagName when there aren't many buttons on the current page;
        signInButton.click();


        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        //PS: Locate Locate Locate
       // input box using “className” locator input box using “id” locator
        //button using “tagName” locator


    }
}
