package com.syntax.review8;

public class Store {
    public static void main(String[] args) {
       Furniture chair=new Chair();// upcasting
        chair.assemble();
        chair.comfort();// if the method implemented in the child class and we create object of parent class accordingly child class, execution will be by child class
        // Runtime polymorphism

        System.out.println(" ");

        Furniture table=new Table();
        table.comfort();// if the method implemented in the child class and we create object of parent class accordingly child class, execution will be by child class
        // Runtime polymorphism
        table.assemble();

        System.out.println(" ");

        Table t=new Table();
        t.assemble();
        t.comfort();
        t.buildTable();
        t.buildTable("Wood");// overloaded
       // Early binding polymorphism achieve through

        System.out.println(" ");

        Chair.breaks();// the method of breaks come from the Chair child class
        Furniture.breaks();// the method of breaks come from the Furniture parent class

        Furniture chair1=new Chair();// upcasting
        chair1.assemble();
        chair1.comfort();
        // Runtime polymorphism
        // proof that method breaks is not override
        chair1.breaks();// since we are not overriding methods breaks will be executed from parent
                         // this is also not the right wat to call static method


    }
}
