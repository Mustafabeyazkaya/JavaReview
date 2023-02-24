package com.syntax.review7;

public class Car {
    protected String make,model;
    int horsePower,year;
    // you can create a constructor with class name
    public Car(String make,String model){// this is not a METHOD, this is a CONSTRUCTOR
        this.make=make;
        this.model=model;
    }
    // update your constructor by adding new parameters
    public Car(String make,String model,int year,int horsePower){
        this(make,model); // calls the constructor which is created before this constructor. making call to the current class constructor
        this.year=year;// accessing current class instance variables
        this.horsePower=horsePower;
    }
    // we have 2 constructor so far.

    // now we are creating METHODS(behaviors,attributes)
    public void start(){// this method is called method with non-arguments
        System.out.println(make+" starts");
    }
    public void drive(int speed){// we can add a new variable in this method, that is called method with arguments
        System.out.println(make+" drives with speed "+speed);
    }
    // we have 2 methods so far.

    // SAME class have 2 or more methods with same name = Method Overloading
    /*
    how to implement?
            1. by using different number of the parameters
            2. by using different type of parameters
            3. sequence
     */
    public void drive(String destination){// now i have 2 methods overloaded as under drive name
        System.out.println(make+" drivers to "+destination);
    }
    public void drive(int speed,String destination){// now i have 3 methods overloaded as under drive name
        System.out.println(make+" drives to "+destination+" with speed "+speed);
    }
    void drive(String destination,int speed){// now i have 4 methods overloaded as under drive name
        System.out.println(make+" drives to "+destination+" with speed = "+speed);
    }
    // am i overloading?
    /*private void drive(int wheel){}
    - NO by overloading you cannot change your access modifier
    *String drive(String destination){
        return destination;
    }
    we cannot overload methods by changing its return type, created return type is sout but now you want return type
    in overloading methods signature MUST BE DIFFERENT
    method signature involves name and parameters only !!

    this note below is not belong to above notes,
    in overloading we don't care about return type (can be changed)
            or access modifiers (can be different)
     */


}


// overload works with CONSTRUCTOR
//super just can be use inhertance