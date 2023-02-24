package com.syntax.review5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int [][] array={{1,2,3,},
                        {11,12,13},
                        {20,21,22},
                        {100,101}
        };
       // getting all values from 2D array usgin enhanced loop
        for (int [] arr:array){// iterates 1D arrays

            for (int ar:arr){// iterates over each element
                if (ar%2==0){// to print only even numbers inside the arrays
                System.out.print(ar+",");
                }
            }
            System.out.println();
        }


        System.out.println("*************");
        // getting all values from 2D array using regular loop
        for (int rows = 0; rows < array.length; rows++) {// outer loops iterates over rows

            for (int column = 0; column < array[rows].length; column++) {// iterates over each column
                if (rows%2!=0){
                System.out.print(array[rows][column]+",");
                }
            }
            System.out.println();
        }


        System.out.println("*******************");
        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);
        int numberOfElementsIn1Array=array[0].length;
        System.out.println(numberOfElementsIn1Array);
        int numberOfElementsIn4Array=array[3].length;
        System.out.println(numberOfElementsIn4Array);

    }
}
