package com.cydeo.tests.day2_Locaters_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_getText_getAttributeMethods {
    public static void main(String[] args) {


        // TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        // 3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));

        //Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header Text verification PASSED!");
        } else {
            System.err.println("Header Text verification FAILED!");
        }


        // 4- Locate “First name” input box
        // locating the web element using "name" locator;
        // name attribute hase "firstname" value;

        //WebElement firstNameInput = driver.findElement(By.name("firstname"));
        WebElement firstNameInput = driver.findElement(By.className("form-control"));


        String expectedPlaceHolder = "first name";
        String actualInternetCollectionOnTopRight = firstNameInput.getAttribute("placeholder");

        //5- Verify placeholder attribute’s value is as expected: Expected: first name

        if (expectedPlaceHolder.equals(actualInternetCollectionOnTopRight)){
            System.out.println("Placeholder Text verification PASSED!");
        }else {
            System.err.println("Placeholder Text verification FAILED!");
        }
        driver.close();




    }


}
