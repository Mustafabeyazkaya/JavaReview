package com.syntax.review9;
// 1. PARENT CLASS
public interface Drawable { // we can't have any instance variables inside interface class
    public static final String TOOL="Pencil";
    void draw(); // by default, this method is public abstract
    // above is how Interface used to be before Java 8
    // after Java 8 static and default methods were added to the Interface
    // look at the below code
    default void print(){// THIS IS GIVE YOU A FLEXIBILITY TO ACCESS
        System.out.println("We are drawing object using "+TOOL);
    }
    static void paper(){// THIS IS GIVE YOU A FLEXIBILITY TO ACCESS
        System.out.println("All drawing are going to be on me");
    }

}
//2 . PARENT CLASS, but abstract
abstract class Shape{// we can have instance variables inside abstract class with any different access modifier
    public String color;
    double width,length;
    Shape (String color,double width,double length){
        this.color=color;
        this.width=width;
        this.length=length;
    }
   public abstract double calculateArea();
}
// 1. CHILD CLASS
class Rectangle extends Shape implements Drawable{// FIRS PUT ABSTRACT CLASS AND THEN INTERFACE CLASS
    Rectangle(String color,double width,double length){
        super(color,width,length);
    }
    @Override
    public double calculateArea() {
        return length*width;
    };
    public void draw(){ // you need to add "public" beggining of every child class method that called from interface parent class
        System.out.println("I am drawing rectangle");
    }
}
// 2. CHILD CLASS
class Square implements Drawable{
    @Override
    public void draw() {// you need to add "public" beggining of every child class method that called from interface parent class
        System.out.println("I am drawing square");
    }
}
