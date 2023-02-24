package com.syntax.review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        //Let's create an array of names using Scanner
        Scanner inp=new Scanner(System.in);
        System.out.println("How many names you want to store?");
        int size= inp.nextInt();
        String [] names=new String[size];
        // This loop store elements inside the array
        // regular for loop work with indexes
        for (int i = 0; i < names.length; i++) {
            System.out.println("Please enter name");
            names[i]=inp.next();
        }
        //Using loop below we can retrieve element
        // enhanced for loop work with variable
        for (String name:names) {
            System.out.println(name);
        }
    }
}
