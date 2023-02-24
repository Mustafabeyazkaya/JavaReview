package com.syntax.review8;

import com.syntax.review7.Car;
import com.syntax.review7.TeslaOfCarClass;

public class CarTester {
    public static void main(String[] args) {
        Bmw X7 =new Bmw("Bmw","X7");
        X7.start();
        X7.drive("Smooth");
        X7.brake();// comes from BMW which is sub class

        Car nissan=new Car("Nissan","Sentra");
        nissan.start();
        nissan.drive(90);
       // nissan.brake(); // this is not pop-up in the parent class because child class method cannot be inheritanced to parent class

        TeslaOfCarClass models=new TeslaOfCarClass("Tesla","Model S",2022,350,"Electric",true);
        // TeslaOfCarClass was not happy when it is created in first second, because the constructor inside the TeslaOfCarClass was not public
        // non-public things can not be created in the different packages
        // i went to TeslaOfCarClass to change access modifier of TeslaOfCarClass instructor to be created an object of TeslaOfCarClass inside the CarTester
        models.start();// override method from TeslaOfCarClass is executed
        models.drive(75);// comes from Parent class
        models.haveAutoPilot();//haveAutoPilot was not happy when it is created in first second, because the method inside the TeslaOfCarClass was not public
        // i went to TeslaOfCarClass to change access modifier of haveAutoPilot method to be created an object of TeslaOfCarClass inside the CarTester
        // comes from Parent class

        // Runtime polymorphism achieved through method overriding
        //Casting; widening and narrowing - used with primitives data type
        //         upcasting and downcasting - used with non-primitives data type

        Car bmw1=new Bmw("Bmw","X77"); // UPCASTING
        bmw1.start();
        bmw1.drive(100);
        bmw1.drive(100,"Miami");



    }
}
