package com.cydeo.tests.day4_findElements_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task5_CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

//Practice: Checkboxes
//1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");
        //  we have to locate the checkboxes first
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));


        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());//false

// 3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());//true

//4. Click checkbox #1 to select it.
        Thread.sleep(3000);
        checkBox1.click();

//5. Click checkbox #2 to deselect it.
        Thread.sleep(3000);
        checkBox2.click();

//6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());//expecting true;


//7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());//expecting false;
    }
}
