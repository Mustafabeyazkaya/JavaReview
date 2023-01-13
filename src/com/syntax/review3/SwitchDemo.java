package com.syntax.review3;

public class SwitchDemo {
    public static void main(String[] args) {
        /*
        World Cup:
        and provide winners
        */
        int worldCupYear=2022;
        switch (worldCupYear){
            default:
                System.out.println("Winner is unknown");// default can be anywhere in switch code,default equals to else but it doesn't need to be end of the code as else, it can be anywhere as in this example
            case 2022:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany");
                break;


        }
    }
}
