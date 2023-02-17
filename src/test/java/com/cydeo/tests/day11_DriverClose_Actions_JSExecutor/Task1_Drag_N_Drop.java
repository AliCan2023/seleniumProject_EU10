package com.cydeo.tests.day11_DriverClose_Actions_JSExecutor;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task1_Drag_N_Drop {

    @Test
    public void drag_drop_test() {

        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //locate "Accept Cookies" button and click;
        BrowserUtility.sleep(3);
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-pc-btn-handler']"));
        BrowserUtility.sleep(3);
        acceptCookiesButton.click();

        BrowserUtility.sleep(3);
        WebElement alertSavePreferenceButton = Driver.getDriver().findElement(By.xpath("//button[@class='save-preference-btn-handler onetrust-close-btn-handler']"));
       // BrowserUtility.sleep(3);
        alertSavePreferenceButton.click();


        //locate small and big circle to be able to drag them around;
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        BrowserUtility.sleep(5);

        // 2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualBigCircleText = bigCircle.getText();
        System.out.println(actualBigCircleText);
        String expectedBigCircleText ="You did great!";

        //Assert.assertEquals(actualBigCircleText,expectedBigCircleText);

    }
}
