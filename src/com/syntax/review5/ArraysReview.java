package com.syntax.review5;

public class ArraysReview {
    public static void main(String[] args) {
        // array is collection of same multiples variables
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        //System.out.println(arr[3]); RunTime error
        System.out.println("to learn Size of the array, use this "+arr.length);

        // to get all value from the array?
        // arr[0]:  arr[1];  arr[2];
//        // to get indexes of array, use a for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("***Second Way***");
        for (int a:arr) {
            System.out.print(a+" ");
        }
        System.out.println();
        String [] colors={"Black","White","Red","Purple","Blue"};
        // anytime we have arrays we can use enhanced for loop
        for(String color:colors) {
            System.out.print(color+" ");
        }
        System.out.println();
        System.out.println("***Second Way***");
        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i]+" ");
        }
        System.out.println();
        System.out.println("***Printing in Revers***");
        for (int i = colors.length-1; i>=0 ; i--) {
            System.out.print(colors[i]+" ");
        }
    }
}
