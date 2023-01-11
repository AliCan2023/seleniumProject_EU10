package com.cydeo.tests.day5_testNG_Intro_dropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_VerifySimpleDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test(priority = 1)
    public void simpleDropDownTest() {

        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropDown.getFirstSelectedOption();
        String actualSimpleDropDownText = currentlySelectedOption.getText();
        String expectedSimpleDropDownText = "Please select an option";
        //System.out.println(actualSimpleDropDownText);

        //Expected: “Please select an option”
        Assert.assertEquals(actualSimpleDropDownText, expectedSimpleDropDownText, "Text is not matching!");
    }



    @Test(priority = 2)
        public void simpleDropdownTest1 () {
            //4. Verify “State selection” default selected value is correct
            Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
            //Expected: “Select a State”
            String expectedStateDropdownText = "Select a State";
            String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

            Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);
            //Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"Select a State");


        }
    }

