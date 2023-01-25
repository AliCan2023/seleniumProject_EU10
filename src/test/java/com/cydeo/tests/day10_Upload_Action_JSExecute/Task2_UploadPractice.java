package com.cydeo.tests.day10_Upload_Action_JSExecute;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_UploadPractice {


    @Test
    public void upload_test(){
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String filePath ="/Users/alibugraoglu/Desktop/CLASS NOTES : DAY 10-2";

        // 3. Upload the file.
        WebElement uploadFile = Driver.getDriver().findElement(By.id("file-upload"));
        //SleepMethod.sleep(3);
        BrowserUtility.sleep(3);
        uploadFile.sendKeys(filePath);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());



    }
}
