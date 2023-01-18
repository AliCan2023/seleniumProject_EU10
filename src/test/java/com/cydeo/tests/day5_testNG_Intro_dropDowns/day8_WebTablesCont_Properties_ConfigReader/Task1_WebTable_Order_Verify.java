package com.cydeo.tests.day5_testNG_Intro_dropDowns.day8_WebTablesCont_Properties_ConfigReader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_WebTable_Order_Verify {
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
        //Locate the cell that has Bob Martin text in it;

        WebElement bobMartinCell=
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        //System.out.println("bobMartinCell = " + bobMartinCell);
        System.out.println(bobMartinCell.getText());

        //2. VerifyBob’s name is listed as expected.
        //Expected: “Bob Martin”

        String expectedBobName = "Bob Martin";
        String actualBobName= bobMartinCell.getAccessibleName();

        Assert.assertEquals(actualBobName,expectedBobName);

        //3. VerifyBobMartin’s order date is as expected;
        //Expected: 12/31/2021
        //Alternative BobMartinDateCell locator = "//td[.='Bob Martin']/../td[5]"
        WebElement BobMartinOrderDateCell
                = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String actualBobMartinDate = BobMartinOrderDateCell.getText();
        String expectedBobMartinDate = "12/31/2021";

        Assert.assertEquals(actualBobMartinDate,expectedBobMartinDate);
    }

// we want to use utility method we created here.
    @Test
    public void order_name_verify_test2() {

        String customerOrderDate = WebTableUtility.returnOrderDate(driver,"Ned Stark");
        System.out.println(customerOrderDate);

        String customerOrderDate1 = WebTableUtility.returnOrderDate(driver,"John Doe");
        System.out.println(customerOrderDate1);

        /*//Locate the cell that has Bob Martin text in it;

        WebElement bobMartinCell=
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        //System.out.println("bobMartinCell = " + bobMartinCell);
        System.out.println(bobMartinCell.getText());

        //2. VerifyBob’s name is listed as expected.
        //Expected: “Bob Martin”

        String expectedBobName = "Bob Martin";
        String actualBobName= bobMartinCell.getAccessibleName();

        Assert.assertEquals(actualBobName,expectedBobName);

        //3. VerifyBobMartin’s order date is as expected;
        //Expected: 12/31/2021
        //Alternative BobMartinDateCell locator = "//td[.='Bob Martin']/../td[5]"
        WebElement BobMartinOrderDateCell
                = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String actualBobMartinDate = BobMartinOrderDateCell.getText();
        String expectedBobMartinDate = "12/31/2021";

        Assert.assertEquals(actualBobMartinDate,expectedBobMartinDate);

         */
    }

    // Using WebTableUtility.orderVerify() method;
    @Test
    public void orderDate_Verify_Test(){

        WebTableUtility.orderVerify(driver,"Alexandra Gray","04/15/2021");


    }
}
/*


 */