package com.cydeo.tests.day10_Upload_Action_JSExecute;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task1_RegistrationFormConfirmation {

    @Test

    public void registration_form_test() {
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver()----->> returns driver
        Driver.getDriver().get(ConfigurationReader.getProperty("registrationFormUrl"));

        //in order to make advantage of JavaFaker I have to create the object of it;
        Faker faker = new Faker();

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String fakerFirstName = faker.name().firstName();
        // inputFirstName.sendKeys(faker.name().firstName());
        inputFirstName.sendKeys(fakerFirstName);

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        // inputUserName.sendKeys(faker.name().username().replaceAll(".",""));// we do have a '.' between username here we're going to remove it using replaceAll()method;
        // or we can use faker.bothify()method to input username in a way i should be;

        String userName = faker.bothify("helpdesk#####");
        inputUserName.sendKeys(userName);//we could have more control for the beginning of username or last part;

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(userName + "@gmail.com");

        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        // inputPassword.sendKeys(faker.numerify("#?#?#?#??#?###?"));
        inputPassword.sendKeys(faker.internet().password());
        System.out.println("faker.internet().password() = " + faker.internet().password());// let's see what we will have;

        //8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        //inputPhoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));//using faker.numerify provides you more control over the format of data;

        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10.Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputBirthday.sendKeys("06/23/1990");
        /*
        int birthYear = faker.number().numberBetween(2002, 1988);
        inputBirthday.sendKeys("" + birthYear);


        String birthday = faker.date().birthday().toString();
        inputBirthday.sendKeys(birthday);
        System.out.println(birthday);
 */

        //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        //12.Select Job Title
        //13.Select programming language from checkboxes
        //14.Click to sign up button
        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.
    }
}
