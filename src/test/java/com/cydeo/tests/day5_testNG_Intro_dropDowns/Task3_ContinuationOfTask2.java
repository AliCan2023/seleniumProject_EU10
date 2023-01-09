package com.cydeo.tests.day5_testNG_Intro_dropDowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task3_ContinuationOfTask2 {
    public static void main(String[] args) throws InterruptedException {
        //TC #3: Radiobutton handling_Continue
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        // locate name='sports' radio button store them in a list of Web Element
        clickAndVerifyRadioButton(driver, "sport", "hockey");
        clickAndVerifyRadioButton(driver, "sport", "water_polo");
        clickAndVerifyRadioButton(driver, "color", "black");

       /*
        //List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        //Loop through the Lis of WebElement and select matching result "hockey";

       for (WebElement each : sportRadioButtons) {

           String eachID  = each.getAttribute("id");

            System.out.println("eachID = " + eachID);
            if (eachID.equals("hockey")){
                Thread.sleep(3000);
                each.click();
                System.out.println("Hockey is selected: "+ each.isSelected());
                break;
            }


        */
    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the Lis of WebElement and select matching result "hockey";
        for (WebElement each : radioButtons) {

            String eachID = each.getAttribute("id");

            if (eachID.equals(idValue)) {

                each.click();
                System.out.println(eachID + " is selected: " + each.isSelected());
                break;
            }

        }

/*
        //3. Click to “Hockey” radio button
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        Thread.sleep(3000);// after we learn selenium waits we had better not use theis method;
        hockeyRadioBtn.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyRadioBtn.isSelected()){
            System.out.println("Button is selected and verifications PASSED!");
        }else{
            System.err.println("Button is not selected and verification FAILED!!!");
        }

 */

        //USE XPATH LOCATOR FOR ALL WebElement LOCATORS
        //Create a utility method to handle above logic.
        // Method name: clickAndVerifyRadioButton Return type: void or boolean
        //Method args:
        //1. WebDriver
        //2. NameAttribute as String(for providing which group of radio buttons)
        // 3. ID attribute as String(for providing which radio button to be clicked)
        //Method should loop through the given group of radio buttons. When it finds the matching option, it should click and verify option is Selected.
        //Print out verification: true
    }
}
