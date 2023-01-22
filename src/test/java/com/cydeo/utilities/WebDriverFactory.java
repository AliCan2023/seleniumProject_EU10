package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
TASK:NEW 　METHOD CREATION.
METHOD NAME: getDriver;
static method
Accepts String argument: browser type;
   -This argument determine what type of browser is opened
   -If "Chrome" passed---> it will open Chrome browser
   -if "firefox" passed ---> it will open firefox browser;
   ReturnType: " WebDriver";

 */
public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        } else {
            System.out.println("Given Browser type is not existed./or is not currently supported.");
            System.out.println("Driver = null");
            return null;
        }


    }
}
