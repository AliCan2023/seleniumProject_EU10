package com.cydeo.tests.day6_alerts_iFrame_Windows.day10_Upload_Action_JSExecute;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task4$5_ScrollPractice {

    @Test
    public void scroll_practice_test() {

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        //first create a locator for the text;
        // WebElement scrollDownText = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        // create an actions object
        Actions actions = new Actions(Driver.getDriver());

        //Locating cydeo link to be able to pass  our "driver" instance
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //BrowserUtility.sleep(3);//instead of using this sleep method we can use pause() method from Actions class;

        //4- Scroll using Actions class “moveTo(element)” method
        // scroll to the "Powered by CYDEO" text
        actions.moveToElement(cydeoLink).perform();

//        1- Continue from where the Task 4 is left in the same test.
//         2- Scroll back up to “Home” link using PageUP button
//        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
//         in this case we don't have to locate the Home link to PageUp we had better use the KeyUp()method from Actions class;
//        BrowserUtility.sleep(3);
//        actions.moveToElement(homeLink).perform();

        // 2- Scroll back up to “Home” link using PageUP button

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();
        //actions.sendKeys(Keys.PAGE_UP).perform();

        //Driver.getDriver().close(); //throws: NoSuchSessionException: invalid session id
        //Driver.getDriver().quit();//completely terminates the browser;

        Driver.closeDriver();//shots down the session and create another session id to keep testing test2 below;


    }


    @Test
    public void test2() {

        Driver.getDriver().get("https://google.com");
        BrowserUtility.sleep(3);
        Driver.closeDriver();

    }

    @Test
    public void test3() {

        Driver.getDriver().get("https://apple.com");
        BrowserUtility.sleep(3);
        Driver.closeDriver();

    }
    @Test
    public void test4() {

        Driver.getDriver().get("https://tesla.com");
        BrowserUtility.sleep(3);
        //Driver.closeDriver();
        System.out.println(Driver.getDriver().getWindowHandle());


    }

}

