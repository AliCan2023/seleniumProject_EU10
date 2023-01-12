package com.cydeo.tests.day6_alerts_iFrame_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownPractices_T5 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //2. Go to http://practice.cybertekschool.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_task5() throws InterruptedException {
        //TC #5: Selecting state from State dropdown and verifying result 1. Open Chrome browser


// we located the dropdown and ready to use;
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(5000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(5000);
        stateDropdown.selectByValue("VA");

        //5. Select California
        Thread.sleep(5000);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText,"Invalid");

        //Use all Select options. (visible text, value, index)
    }

    @Test
    public void dropdown_task6(){
        // since we create BeforeMethod right below the class we don't need to set up the first phase
        //3. Select “December 1st, 1933” and verify it is selected.
       Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text
        yearDropdown.selectByVisibleText("1933");

        // Select month using : value attribute
        monthDropdown.selectByValue("11");

        // Select day using : index number
        dayDropdown.selectByIndex(0);

        //create expected value;
        String expectedYear = "1933";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from the browser;
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);

    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }
}

