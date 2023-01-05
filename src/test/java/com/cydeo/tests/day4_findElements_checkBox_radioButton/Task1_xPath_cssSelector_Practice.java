package com.cydeo.tests.day4_findElements_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task1_xPath_cssSelector_Practice {
    public static void main(String[] args) {

        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        WebElement homLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //locate homeLink using cssSelector syntax2#;
        WebElement homLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));

        //locate homeLink using cssSelector href value;
        WebElement homLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        // locate header using cssSelector: locate parent element and move down to h2;
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example>h2"));

        //Locate header using xpath,and using webElements text"Forgot Password ";
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox1 = driver.findElement(By.xpath("//input[@name='email']"));

        //locate inputBox using xpath contains method; syntax: //tagName[contains(@attribute,'value')];

        WebElement inputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        // f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;'] "));

        //4. Verify all web elements are displayed.
        System.out.println("homLink_ex1.isDisplayed() = " + homLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox1.isDisplayed() = " + inputBox1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());


        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
    }
}