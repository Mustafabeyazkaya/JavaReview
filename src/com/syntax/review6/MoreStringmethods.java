package com.syntax.review6;

public class MoreStringmethods {
    public static void main(String[] args) {
        String myString = "Today is February 2";
        //Splits this string around matches of the given regular expression
        String[] strArray = myString.split(" ");// split methods dived the sentence to create an array to be printed out one by one
        for (int i = 0; i < strArray.length; i++) {// to learn how many index the sentence has
            System.out.println(i);
        }
        for (String arr : strArray) {// to learn inside of sentence by index of index
            System.out.println(arr);
        }
        System.out.println("***********************************");
        System.out.println(myString);
        String newStr = myString.substring(9);
        System.out.println(newStr);
        newStr=myString.substring(9,17);
        System.out.println(newStr);
        int index=newStr.indexOf('b');
        System.out.println(index);
        System.out.println("**************");
        String anotherStr="Today is Thursday";
        int indexOf=anotherStr.indexOf("is");
        System.out.println(indexOf);
    }
}
