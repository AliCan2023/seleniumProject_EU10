package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage {

    public DoubleClickPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy(id = "demo")//using css;
    @FindBy(xpath = "//p[.='Double-click me to change my text color.']")
    public WebElement textToDoubleClick;




}
