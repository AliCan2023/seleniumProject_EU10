package com.cydeo.tests.day10_Upload_Action_JSExecute;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Task7_JSEXcutorWithDifferentSolution {
        @Test
        public void scrollDownWithJS() {
            //1- Open a chrome browser
            //2- Go to: https://practice.cydeo.com/large
            Driver.getDriver().get(" https://practice.cydeo.com/large");
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

            //3- Scroll down to “Cydeo” link
            List<WebElement> list = Driver.getDriver().findElements(By.tagName("a"));

            WebElement cydeo = null;
            WebElement homeLink = null;
            for (WebElement each : list) {
                System.out.println(each.getText());

                if (each.getText().equals("CYDEO")) {
                    cydeo = each;
                }
                if (each.getText().equals("Home")) {
                    homeLink = each;
                }

            }
            BrowserUtility.sleep(3);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", cydeo);


            //4- Scroll up to “Home” link
            BrowserUtility.sleep(3);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", homeLink);


        }
    }

