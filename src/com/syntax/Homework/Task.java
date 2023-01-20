package com.syntax.Homework;

public class Task {
    public static void main(String[] args) {
        /*
        create a digital clock
        You code should print time starting 00:00 and ending 23:59.
         */
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i==2 && j==4){
                    break;
                }
                for (int k = 0; k <= 5; k++) {
                    for (int l = 0; l <= 9; l++) {
                        System.out.println(i+""+j+":"+k+""+l);
                    }

                }
            }
        }
    }}

