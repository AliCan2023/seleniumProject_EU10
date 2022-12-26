package com.cydeo.tests.day3_Tasks_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4_CssSelector_Practice {
    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

       try {
           driver.manage().window().maximize();
       }catch (NullPointerException e){
           e.printStackTrace();
       }


        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        //1.LOCATED USING CLASS ATTRIBUTE
        //WebElement ResetPassButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        WebElement ResetPassButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        String expectedButtonText = "Reset password";
        // getting the value of the attribute "value";
        //String actualButtonText = ResetPassButton.getAttribute("Value");// here in this button paired closing tag the Reset Password Text doesn't come from the value attribute
                                                                     // That's why we use .getText method instead of .getAttribute;
        String actualButtonText =ResetPassButton.getText(); // sometimes the value attribute is the same as text between opening and closing tag but not necessary to be the same;


        if (actualButtonText.equals(expectedButtonText)) {
            System.out.println("Reset Button Text verification PASSED!");
        } else {
            System.err.println("Reset Button Text verification FAILED!");
            //PS: Inspect and decide which locator you should be using to locate web elements.
            //PS2: Pay attention to where to get the text of this button from
        }

    }
}
