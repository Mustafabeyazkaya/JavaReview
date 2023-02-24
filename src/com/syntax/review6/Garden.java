package com.syntax.review6;

public class Garden {
    public static void main(String[] args) {
        // accessing variables of flower class
        Flower flower1=new Flower();
        System.out.println(Flower.pretty); // correct way to access static variable
        flower1.name="Hibiscus";
        flower1.color="Red";
        flower1.price=5;
        flower1.price=11;// te reassign
        flower1.pretty=false;// not the right away to access static variable but it is
        System.out.println("Hibiscus pretty? "+flower1.pretty);
        System.out.println(flower1.price);

        //flower1.size= error - since variables sie does not exist in flower class

        // accessing methods of Flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        // accessing variables of flower class
        Flower flower2=new Flower();
        flower2.name="Rose";
        flower2.color="Blue";
        flower2.price=15;
        //flower2.size= error - since variables sie does not exist in flower class

        // accessing methods of Flowers class
        flower2.bloom();
        flower2.grow();
        flower2.smell();

        // accessing variables of flower class
        Flower flower3=new Flower();
        flower3.name="Hibiscus";
        flower3.color="White";
        flower3.price=10;
        //flower1.size= error - since variables sie does not exist in flower class

        // accessing methods of Flowers class
        flower3.bloom();
        flower3.grow();
        flower3.smell();

    }
}
