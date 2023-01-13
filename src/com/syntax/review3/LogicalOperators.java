package com.syntax.review3;

import java.sql.SQLOutput;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("************** LOGICAL AND**************");
        boolean loginButtonDisplayed = true;

        boolean loginButtonClickable = true;

        if (loginButtonDisplayed && loginButtonClickable) {

            System.out.println("Test case is passed");

        } else {

            System.out.println("Test case failed");
        }

        System.out.println("***************LOGICAL OR*****************");

        boolean dashboard = false;

        String massage = "Welcome admin";

        if (dashboard || massage.equalsIgnoreCase("Welcome admin")) {

            System.out.println("You are logged in");

        } else {

            System.out.println("Your are still log out");

        }
        System.out.println("********************** LOGICAL NOT****************");

        boolean b=true;

        System.out.println(!b);

        boolean agreeCheckboxSelected=true;

        if (!agreeCheckboxSelected){

            System.out.println("I am clicking on checkbox");

        }else {

            System.out.println("I am clicking on submit button");

        }
    }
    }

