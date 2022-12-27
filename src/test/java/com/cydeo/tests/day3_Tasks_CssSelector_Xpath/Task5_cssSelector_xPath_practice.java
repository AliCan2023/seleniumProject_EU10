package com.cydeo.tests.day3_Tasks_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task5_cssSelector_xPath_practice {
    public static void main(String[] args) {

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3- Enter incorrect username into login box:
        WebElement logInBox = driver.findElement(By.xpath("//*[@id='login-popup']/form/div[2]/div[1]/input"));
        logInBox.sendKeys("incorrect username");

        //4- Click to `Reset password` button
        WebElement resetPassButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPassButton.click();
        //5- Verify “error” label is as expected;
        //Expected: Login or E-mail not found
        String expectedErrorLabel ="Login or E-mail not found";
        String actualErrorLabel=driver.findElement(By.className("errortext")).getText();

        if (actualErrorLabel.equals(expectedErrorLabel)){
            System.out.println("Error label verification PASSED");
        }else{
            System.err.println("Error label verification FAILED!");
        }
        //PS: Inspect and decide which locator you should be using to locate web elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
