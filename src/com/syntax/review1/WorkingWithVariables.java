package com.syntax.review1;

public class WorkingWithVariables {
    public static void main(String[] args) {
        // create a variable and store value into it
        // declared a variable and initialized it
        int number=10;

        // decleared a variable
        int num;// declaration of a variable happens only once
        num=100;// initialize th variable
        num=200;// reassign the variable
        num=2000;
        num=5000;
        //num=30.1;error bacuse of wrong data type, you cant put decimal number into int


        System.out.println(num);//200

        boolean hungry=false;
        hungry=true;
        //hungry="yes"; error because you cant put any thing except true or false into boolean

        // String is the most popular datatype
        String myString="Hello";
        String name="Artem";
        String address="123 Test Drive";

        // Hello Artem
        System.out.println(myString+" "+name);

        int age=21;

        //Artem is 21 years old
        System.out.println(name+" "+"is"+" "+age+" "+"years old");
        System.out.println(name +" is "+ age+" years old");

        /*
        if we want to attach String to anything:
        String to another String
        String to int
        String to boolean
        String to char.....

        we use + --> acts as concatenation
         */

        // when we have 2 numeric values + acts as addition
        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;

        // 14 December
        System.out.println(day+" " +month);

        char date='1';
        System.out.println(date+" "+month);

        System.out.println(date+" "+day);


    }
}
