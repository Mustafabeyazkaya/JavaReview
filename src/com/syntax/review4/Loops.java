package com.syntax.review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // While loop
        int a=1;
        while(a<=3){
            System.out.println("I am while loop");
            a++;
        }

        // when we don't know how many times we need to repeat a block of code
        // while or do loop
        int b=1;
        do {
            System.out.println("Do While");
        }while (b>3);

//        // Ask students if they understand loop?
        // if the don't --> tell them to practice more on loops
        // if they understand --> you good ove to array concept
        Scanner inp=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer=inp.nextLine();
        }while (!answer.equalsIgnoreCase("Yes"));
        System.out.println("Great Job,Let's learn arrays now");




    }
}
