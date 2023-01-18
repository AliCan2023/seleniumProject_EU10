package com.cydeo.tests.day8_WebTablesCont_Properties_ConfigReader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_WebTable_Order_Verifier {
    WebDriver driver;
    // 1. Goto:https://practice.cydeo.com/web-tables

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verify_test() {




    }


}
/*

2. VerifyBob’s name is listed as expected.
Expected: “Bob Martin”
3. VerifyBobMartin’s order date is as expected;
Expected: 12/31/2021
 */