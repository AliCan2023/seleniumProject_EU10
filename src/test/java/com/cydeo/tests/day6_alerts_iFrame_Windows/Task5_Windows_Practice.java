package com.cydeo.tests.day6_alerts_iFrame_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task5_Windows_Practice {
    //1. Create new test and make setups
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3.Go to: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test() throws InterruptedException {
        // storing the main page's window handel as string is a good practice for future reusable purpose;
        String mainHandle = driver.getWindowHandle();// window handle is randomly generated whenever we run our driver and window handles are different from each  other;
        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Not match...");
        System.out.println("Title before click: " + actualTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        Thread.sleep(3000);

        //actualTitle = driver.getTitle();
        //System.out.println("Title after click: " + actualTitle);

        //6. Switch to new Window.
        Set<String> allWindowHandles = driver.getWindowHandles();
        //window handle 1 -main handle
        // window handle 2 - 2nd window (New window);
        for (String each:allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());

        }

        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        String actualTitleAfterClick = driver.getTitle();

        Assert.assertEquals(actualTitleAfterClick,expectedTitleAfterClick);
        System.out.println("Actual Title After Click = " + actualTitleAfterClick);

        // If we wanna go back to main page we can use already stored main handle
        //driver.switchTo().window(mainHandle);
    }
    @AfterMethod
    public void tearDown(){ // your window handle is always the same unless you change your driver session;
        //driver.close();//
       // driver.quit();

    }
    /*
    The main difference between a Set and a List or an Array is that a Set can only contain unique elements, while a List or an Array can contain duplicate elements. This makes Set useful for situations where you only want to keep track of unique elements, such as removing duplicates from a list of strings.

For example,
Set<String> mySet = new HashSet<>();
mySet.add("Apple");
mySet.add("Banana");
mySet.add("Apple"); // this element will not be added to the set
In the above example, mySet will only contain two elements "Apple" and "Banana"



     */




}
