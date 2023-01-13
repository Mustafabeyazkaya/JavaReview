package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {
        /* Nested if is 1 is statement inside another if statement

        when we have condition that depends on another

         */
        boolean vaccine=true;
        int dose=2;

        if(vaccine){// outer if (ilk ve disaridaki if)

            System.out.println("How many doses you have?");
            // inner if( icerideki ve ilk if e yani disaridaki if e bagli olan if)
            if (dose==1){
                System.out.println("You need a second shot");
            }else {
                System.out.println("You are full vaccineted");
            }
        }else{
            System.out.println("i haven't get a vaccine yet");
        }
    }
}
