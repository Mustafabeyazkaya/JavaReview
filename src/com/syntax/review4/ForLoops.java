package com.syntax.review4;

public class ForLoops {
    public static void main(String[] args) {
        // best loop - used when we know how many times we tant to repeat block of codes
        for ( int i=2;i<=20;i+=5){
        System.out.println(i);
        }
        System.out.println("*************");
        // break and continue
        // break;
        for (int i = 2; i <= 20; i+=5) {
            System.out.println(i);
            if (i==12){
                System.out.println("i is equal to 12 - I am breaking my loop");
                break;//stops/breaks the loops
            }
        }
        // continue-skips current iteration
        for (int i = 1; i <=10 ; i++) {
            if (i%3==0){
            System.out.println(i);
            continue;// java goes back to the begigining of the loop
                // and skips the rest of the code that is inside loop body
            }
            System.out.println("Hello");
        }

    }
}
