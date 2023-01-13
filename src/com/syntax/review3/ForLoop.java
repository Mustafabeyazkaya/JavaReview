package com.syntax.review3;

public class ForLoop {
    public static void main(String[] args) {
        // 1. initialization
        // 2. condition
        // 3. if true --> code goes inside the loop body
        // goes back, increment
        // repeat
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello " + i);
        }

        System.out.println("***********************NEXT EXAMPLE*******************************");

        for (int a = 0; a < 8; a += 4) {
            System.out.println("Bye");
        }

        System.out.println("************NEXT EXAMPLE****************");

        for (int r = 2; r > 10; r++) {
            System.out.println(r);
        }
        System.out.println("End");
        System.out.println("******NEXT EXAMPLE************");
        // this example goes to infinite , that's why i got it into comment
       /* for (int j = 3; j < 10; j--) {
            System.out.println(j);
        }*/

    }
}
