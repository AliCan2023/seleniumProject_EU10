package com.cydeo.tests.day9_javaFaker_testbase_driverUtility;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {



    @Test

    public void test1(){
        // creating Faker object to reach methods

        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = "
                + faker.name().firstName());
        System.out.println("faker.name().lastName() = "
                + faker.name().lastName());
        System.out.println("faker.name().fullName() = "
                + faker.name().fullName());
        System.out.println("faker.address().city() = "
                + faker.address().city());
        //System.out.println("faker.numerify() = "
        // + faker.numerify("###-###-##-##-###"));// pass the format and numerify;
        System.out.println("faker.numerify(\"###-###-##-##\") = "
                + faker.numerify("###-###-##-##"));
        System.out.println("faker.numerify(\"534-###-##-33\") = "
                + faker.numerify("534-###-##-33"));

        System.out.println("faker.letterify(\"???-???-??-??\") = "
                + faker.letterify("???-???-??-??yy"));
        System.out.println("faker.bothify(\"#?#?-##??-#?\") = "
                + faker.bothify("#?#?-##??-#?xxx"));
        System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"\") = "
                + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris","Muhtar"));

    }
}
