package com.cydeo.utilities;

public class SleepMethod {
    public static void sleep(double seconds) {

        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
