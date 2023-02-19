package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

    public DynamicLoad1Page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(css = "dive#loading")// using css; # is id;
    public WebElement loadingBar;

    @FindBy(xpath = "//input[@type='username']")
    public WebElement inputUserName;

    // @FindBy(id = "pwd")
    @FindBy(css = "#pwd")
    public WebElement inputPassword;

//    @FindBy(css = "button.btn.btn-primary")
//    public WebElement submitButton;

    @FindBy(xpath = " //button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id = "flash")
    public WebElement errorMessage;

}
