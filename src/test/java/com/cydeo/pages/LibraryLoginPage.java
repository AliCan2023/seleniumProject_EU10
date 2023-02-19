package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    //#1- initialize the driver instance and object of the class

    public LibraryLoginPage() {
        /*
        initElements method will create connection in between the current
        driver session(instance) and the object of the current class.
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }
    /*
    PageFactory.initElements() is a method in the Selenium WebDriver API that is used to initialize web elements defined in a Page Object in a Selenium test script.
    In a Page Object Model (POM) framework, the pages of a web application are represented as Java classes, and each page has its own Page Object class.
The Page Object class contains the web elements present on the page and the methods to perform actions on them. The purpose of this model is to separate
the Page Object from the test logic and make the code more modular and maintainable.
    In the code snippet PageFactory.initElements(Driver.getDriver(), this);, Driver.getDriver() returns the instance of the WebDriver that is currently active,
and this refers to the current Page Object class. This method initializes all the web elements defined in the Page Object class and assigns them
to their respective variables.
    After this initialization, the test script can call the methods defined in the Page Object class to interact with the web elements on the page.
 By using the initElements method, we can avoid NullPointerExceptions that may occur when trying to access uninitialized web elements.
     */

    //LibraryLoginPage libraryLoginPage = new LibraryLoginPage(); // if you are in a different package calling the constructor of the current page  referring to this keyword;

    //#2- use @FindBy annotation to locate webElements.

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;
    //normally we do like this
    //WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//sddfdffs.[skjfdkfjkdjf]"));
    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath= " //div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEMailErrorMessage;

    //@FindBy(xpath = "//div[@class='alert alert-danger']")
    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEMailOrPassWordErrorMessage;


}
