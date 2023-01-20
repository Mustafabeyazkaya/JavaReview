package com.syntax.review4;

public class NestedLoops {
    public static void main(String[] args) {
        // nested loop - loop inside another loop
        // inner loop ALWAYS depends on outer loop
        for (int i = 1; i <=3; i++) {// outer loop
            for (int j = 1; j <= 4; j++) {//inner loop
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("*****************");
        //outer loop controls
        for (int i = 1; i <5 ; i++) {// outer loop
            System.out.println("Hello");
            for (int j = 1; j <=2 ; j++) {// inner loop
                System.out.println("Bye");
            }
        }
    }
}
