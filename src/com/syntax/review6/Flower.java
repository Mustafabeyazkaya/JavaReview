package com.syntax.review6;

public class Flower {
    // attributes, properties
    String color,name;
    int price;
    // behavior
    void smell(){
        System.out.println(name+" Flower smells");
    }
    void bloom(){
        System.out.println(name+" Flower blooms");
    }
    void grow(){
        System.out.println(name+" Flower grows");
    }
    static boolean pretty=true;
}
