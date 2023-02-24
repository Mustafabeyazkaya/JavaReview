package com.syntax.Homework;

public class TaskSecondWay {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 10; l++) {
                        if (i == 2 && j > 3) {
                            break;
                        }
                        System.out.println(i + "" + j + " : " + k + l);
                    }
                }
            }
        }
        System.out.println("***Second Way***");
        for (int h1= 0; h1 <=2; h1++) {
            for (int h2 = 0; h2<=9; h2++) {
                if (h1==2 && h2==4){
                    break;
                }
                for (int m = 0; m <=59 ; m++) {
                    if (m<10){
                        System.out.println(h1+""+h2+":0"+m);
                    }else {
                        System.out.println(h1+""+h2+":"+m);
                    }
                }
            }

    }
}}
