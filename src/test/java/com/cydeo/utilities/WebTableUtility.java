package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtility {
    //1. Create a new class called WebTableUtils.
    //2. Create two methods to verify order

    //This method should accept a costumerName and return the costumer order date as a String.
    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    public static String returnOrderDate(WebDriver driver, String customerName) {
        String locator = " //td[.='" + customerName + "']/following-sibling::td[3]";// created dynamic locator;
        /*
        //our goal is dynamically change the locator without touching the locator itself;String middleName = "L";
        String fullName= "Samuel ."+middleName+". Jackson";

         */
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }

    public static String returnOrderDate2(WebDriver driver, String customerName) {

        return driver.findElement(By.xpath(" //td[.='" + customerName + "']/following-sibling::td[3]")).getText();

    }

    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //• Arg3: String expectedOrderDate
    //This method should accept above mentioned arguments and internally assert expectedOrderDate matching actualOrderDate.

    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){
        String locator = " //td[.='" + customerName + "']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();
        //String expectedOrderDate: directly comes from the argument we pass;

        Assert.assertEquals(actualOrderDate,expectedOrderDate);

    }
}
