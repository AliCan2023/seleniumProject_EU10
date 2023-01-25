package com.cydeo.tests.day9_javaFaker_testbase_driverUtility;

public class SingleTon {
    //1# create private constructor
    private SingleTon() {

    }

    //2# create private static string;
    //prevent access and provide a getter method;
    private static String word;

    //3#
    public static String getWord() {
        if (word == null) {
            System.out.println("First Time call word object is null;");
            word = "something";
        } else {
            System.out.println("Word has already value;");
        }
        return word;
    }
}
