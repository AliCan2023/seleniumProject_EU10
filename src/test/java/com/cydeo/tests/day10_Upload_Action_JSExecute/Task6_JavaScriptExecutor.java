package com.cydeo.tests.day10_Upload_Action_JSExecute;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Task6_JavaScriptExecutor {

    @Test

    public void java_Script_Executor(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        // 3- Use below JavaScript method and scroll
        //JavaScript method to use : window.scrollBy(0,0)
        //((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,0)");//downcast driverType to JavaScriptExecutor interface;
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //a. 750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            BrowserUtility.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }
        //b. 750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
            BrowserUtility.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
        }




    }
}
