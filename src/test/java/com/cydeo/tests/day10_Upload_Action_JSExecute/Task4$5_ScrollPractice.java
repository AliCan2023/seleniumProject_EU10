package com.cydeo.tests.day10_Upload_Action_JSExecute;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task4$5_ScrollPractice {

    @Test
    public void scroll_practice_test(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”
        //first create a locator for the text;
        WebElement scrollDownText = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        //4- Scroll using Actions class “moveTo(element)” method
        // create an actions object
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtility.sleep(3);
        actions.moveToElement(scrollDownText).perform();
        // scroll to the "Powered by CYDEO" text

        //1- Continue from where the Task 4 is left in the same test.
        // 2- Scroll back up to “Home” link using PageUP button
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
        BrowserUtility.sleep(3);
        actions.moveToElement(homeLink).perform();
        //actions.sendKeys(Keys.PAGE_UP).build().perform();



    }
    }

