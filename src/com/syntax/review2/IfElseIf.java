package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        /* when we have more conditions to test
        if ( boolean condition) {
        code A;
        } else if (boolean condition) {
                 code B;
        } else if (boolean condition) {
        code C;
        }
        */
        /* Check Homework
           if you completed more than 25 -> Great Job
           if you completed more than 20 -> Good Job
           if you completed more than 10 -> Okey Job
           if you completed more than 5 -> Not Good Job

         */
        int HomeWork = 15;
        if (HomeWork >= 25) {
            System.out.println("Great Job");
        } else if (HomeWork >= 20) {
            System.out.println("Good Job");
        } else if (HomeWork >= 10) {
            System.out.println("Okey Job");
        } else if (HomeWork >= 5) {
            System.out.println("Not Good Job");
        }
        System.out.println("------------------------------------");

        String browser= "firefox";
        if (browser.equals("chrome")) {
            System.out.println("Tes cases executed on chrome browser");
        }else if (browser.equals("safari")){
            System.out.println("Test cases executed on safari browser");
        }else if (browser.equals("firefox")){
            System.out.println("Test cases executed on firefox browser");
        }
        // i can put "else" and of the all condition, if all conditions are wrong,
        // for example:
        System.out.println("------------------------------------");
        String browser1= "opera";
        if (browser1.equals("chrome")) {
            System.out.println("Tes cases executed on chrome browser");
        }else if (browser1.equals("safari")){
            System.out.println("Test cases executed on safari browser");
        }else if (browser1.equals("firefox")){
            System.out.println("Test cases executed on firefox browser");
        }else {// when none of the conditions are true, code comes to else block
            System.out.println("Browser is not supported");
    }}}