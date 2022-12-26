package com.cydeo.tests.day3_Tasks_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_NextBaseCRM_Locators_getText {
    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        // 1- Open a Chrome browser
       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
   */

        WebDriver driver  = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement inputUser = driver.findElement(By.className("login-inp"));
        inputUser.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect” ; in order to auto generate local variables: Option+ ENTER
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to log in button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();// get the WebElement and store it to String value;

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message verification PASSED!");
        } else {
            System.err.println("Error message verification FAILED!");
        }

    }
}
