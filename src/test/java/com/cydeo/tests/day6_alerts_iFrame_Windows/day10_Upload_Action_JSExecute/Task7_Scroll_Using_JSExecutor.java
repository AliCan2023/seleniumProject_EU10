package com.cydeo.tests.day6_alerts_iFrame_Windows.day10_Upload_Action_JSExecute;

import com.cydeo.utilities.BrowserUtility;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task7_Scroll_Using_JSExecutor {

    @Test
    public void scroll_JSExecutor_test() {

        //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        // 3- Scroll down to “Cydeo” link
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //Scroll down to “Cydeo” link
        WebElement scrollDownCydeo = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        //String str = scrollDownCydeo.getText();
        //System.out.println("str = " + str);

        BrowserUtility.sleep(3);
        js.executeScript("arguments[0].scrollIntoView(true)", scrollDownCydeo);
        // js.executeScript(arguments[0].scrollIntoView(true));


        /*WebElement scrollDownCydeo = Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtility.sleep(2);
        actions.scrollToElement(scrollDownCydeo).perform();

         */
        //4- Scroll up to “Home” link
        WebElement scrollUpHome = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
        //String str1 = scrollUpHome.getText();
        //System.out.println("str1 = " + str1);

        BrowserUtility.sleep(3);
        js.executeScript("arguments[0].scrollIntoView(true);", scrollUpHome);

        //5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as arguments into executeScript() method
    }


}
