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

    }
}
