package com.cydeo.tests.day3_Tasks_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_getAttribute_CssSelector {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        //WebElement logInButton = driver.findElement(By.className("login-btn"));//old way of doing it. it works as long as there is no other same class name for another function or button;

        // Let's use css selector xpath:
        //tagName[attribute='value'];
        //input[class ='login-btn'] ---> you gotta go to inspection and try to find this if you cannot find it mean it doesn't show in the SE;

        //1.LOCATED USING CLASS ATTRIBUTE
        //WebElement logInButton = driver.findElement(By.cssSelector("input[class ='login-btn']"));
        //2.LOCATED USING TYPE ATTRIBUTE
        //WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //3LOCATED USING VALUE ATTRIBUTED;
        WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String expectedButtonText = "Log In";
        // getting the value of the attribute "value";
        String actualButtonText = logInButton.getAttribute("Value");

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Button Text verification PASSED!");
        }else{
            System.err.println("Button Text verification FAILED!");
        }




        // PS: Inspect and decide which locator you should be using to locate web elements.
        //PS2: Pay attention to where to get the text of this button from



    }
}
