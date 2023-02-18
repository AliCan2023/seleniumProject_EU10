package com.cydeo.pages.day12_PageObjectModel_Synchronization;

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

    //#2- use @FindBy annotation to locate webElements.

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    //normally we do like this
    //WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//sddfdffs.[skjfdkfjkdjf]"));

    @FindBy(id= "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;






}
