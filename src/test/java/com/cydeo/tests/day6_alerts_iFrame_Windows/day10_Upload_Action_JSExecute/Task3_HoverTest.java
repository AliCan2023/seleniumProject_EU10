package com.cydeo.tests.day6_alerts_iFrame_Windows.day10_Upload_Action_JSExecute;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_HoverTest {

    @Test
    public void hovering_test(){
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //locate all images here
        WebElement image1= Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3= Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //locate all 'user' text;
        WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());
        // 2. Hover over to first image
        BrowserUtility.sleep(3);
        actions.moveToElement(image1).perform();

        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
        //b. “view profile” is displayed// since user is displayed this one is also displayed no need to do;

        // 4. Hover over to second image
        BrowserUtility.sleep(3);
        actions.moveToElement(image2).perform();

        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

        // 6. Hover over to third image
        BrowserUtility.sleep(3);
        actions.moveToElement(image3).perform();

        //7. Confirm:
        //a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());



    }
}
