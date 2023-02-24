package com.syntax.review7;

public class TeslaOfCarClass extends Car {
    // this is the child class of Car class which is parent class
    // Car class is a super,parent or base class called
    String type;
    boolean autoPilot;
    // we have 2 instance of child class feature which is parent class not has
     public TeslaOfCarClass(String make,String model,int year,int horsePower,String type,boolean autoPilot){// now we use the 2.constructor of super class
        super(make,model,year,horsePower);// you gotta add some parameters in () because there is no non argumnet constructor in your parent class
        this.type=type;
        this.autoPilot=autoPilot;// before we reassing this instance veriables in constructor, we gotta add them into () of chill class as above
        }
        // in child class, we can also have an own methods as below
   public void haveAutoPilot(){
        System.out.println(make+" have auto pilot? : "+autoPilot);
    }

    // now we are practicing on override
    // Overriding - is when we have same method name in 2 DIFFERENT Class (Parent - Child)
    // in overriding - INHERITANCE IS A MUST
    // in overriding method signature should be SAME
    public void start(){// you must create it with public because it is created with public in parent class
        // to override same method in the child class, you need to create the same header
        System.out.println(make+" starts automatically");
    }

}
