package com.cydeo.tests.day5_testNG_Intro_dropDowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @Test(priority = 1)
    public void test1() {

        System.out.println("Test1 is running...");

        // ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test2 is running...");
        //AsserTrue
        String actual = "apple";
        String expected = "apple3";
        Assert.assertTrue(actual.equals(expected));

    }
    @BeforeClass
    public void setUp(){
        System.out.println("---->BeforeClass is running....");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("---->AfterClass is running....");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println(" ---->Before method is running...");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println(" -----> After method is running...");
    }

}
