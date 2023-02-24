package com.syntax.review8;

import com.syntax.review7.Car;

public class Bmw extends Car {// having another child class of Car class that is created in previous package
     Bmw(String make, String model) {
        super(make, model);
    }
    public void start(){// in parent class, this is public, that's why we can make public only
        System.out.println(make+" starts with push start button");
    }
    public void drive (String typeOfDriving){// in parent class, this is protected, that's why we can make it protected or public
        System.out.println(make+" drives "+typeOfDriving);
    }
    void brake(){
        System.out.println(make+" brakes ");
    }

}
