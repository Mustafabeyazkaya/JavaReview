package com.syntax.review7;

public class GarageofChildclassOfCARclass {
    public static void main(String[] args) {
       TeslaOfCarClass tesla=new TeslaOfCarClass("Tesla","Model S",2022,340,"Electric Car",true);

       // from super class
       tesla.start();
       tesla.drive(100);

       // from child class
       tesla.haveAutoPilot();
       tesla.drive("Miami");// now we used another drive method in the same class, check above out

    }
}
