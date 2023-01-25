package com.cydeo.tests.day9_javaFaker_testbase_driverUtility;

import org.testng.annotations.Test;

public class SingletonPractice {

     @Test (priority = 2)

    public void singleton_understand_test1() {
        String str1 = SingleTon.getWord();
        System.out.println("str1 = " + str1);

        String str2 = SingleTon.getWord();
        System.out.println("str2 = " + str2);

        String str3 = SingleTon.getWord();
        System.out.println("str3 = " + str3);
    }


    @Test(priority = 1)

    public void singleton_understanding_test2() {

        String str4 = SingleTon.getWord();
        System.out.println("str4 = " + str4);
    }

}
