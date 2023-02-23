package com.cydeo.tests.day13_Review_and_Practice;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractice {

    //TC #2: Explicit wait practice
    //1- Open a Chrome browser
    //2- Go to: https://practice.cydeo.com/dynamic_controls


    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();

    }

    @Test
    public void remove_button_test() {

        // 3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);//turn the implicit wait off;
        //by doing so successfully fasten the speed of performance;
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        //If you use explicit wait while your implicit wait is on it generates unexpected wait; so to solve this first kill the implicit wait;

        BrowserUtility.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        //5- Verify:
        //a . Checkbox is not displayed
        try {
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
            // assertFalse method will pass the test if the boolean value returned is : false
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        } catch (NoSuchElementException n) {
            Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

        System.out.println(dynamicControlsPage.message.getText());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));
    }

    @Test
    public void enable_button_test() {

        // 3- Click to “Enable” button
//        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
//                + dynamicControlsPage.inputBox.isEnabled());
       dynamicControlsPage.enableButton.click();
        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());//false

        //4- Wait until “loading bar disappears”
        //Calling  out explicit wait method to wait loadingBar to be disappeared;
        BrowserUtility.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());//true

        //5- Verify:
        //a . Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        System.out.println(dynamicControlsPage.message.getText());

        //Check the String value is matching as expected:"It's enabled!";
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled!"));
    }


}
