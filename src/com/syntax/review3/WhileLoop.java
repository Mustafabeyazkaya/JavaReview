package com.syntax.review3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<=4){
            System.out.println("Hello");
            i++;
        }
        Scanner inp=new Scanner(System.in);
        System.out.println("Are you tired?");
        boolean tired=inp.nextBoolean();
        while (!tired){
            System.out.println("This is great");
            System.out.println("Let's study Java");
            System.out.println("Are you tired?");
            tired=inp.nextBoolean();
            System.out.println("go to sleep");
        }

    }
}
