package com.cydeo.tests.day7_Webtables_Utilities_JavaFaker;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3_CRM_LogIn {
    WebDriver driver;

    //1. Create new test and make setups
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
    }


    @Test
    public void crm_login_test() {

//2. Goto:http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

//3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        //USERNAME                         PASSWORD
        // helpdesk1@cybertekschool.com    UserUser
        // Helpdesk2@cybertekschool.com    UserUser
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");
        //inputUserName.sendKeys("helpdesk2@cybertekschool.com");


//4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

//5. Click to`LogIn`button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
//6. Verify title is as expected:
        //Expected: Portal(here in my web browser it never appears as Portal but"My tasks" )

        BrowserUtility.verifyTitle(driver, "My tasks");// i think it depends on the ip you login and changes the title;


    }
}

