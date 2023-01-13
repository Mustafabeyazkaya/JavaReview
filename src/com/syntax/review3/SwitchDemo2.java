package com.syntax.review3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        /*
        Using scanner ask user to enter browser
         based on the browser -> execute code
         */
        System.out.println("Please enter your favorite browser");
        String browser=inp.nextLine().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "safari":
                System.out.println("Test case executed in "+browser);
                break;
            case "microsoft edge":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown - no execution");
        }




        }

}
