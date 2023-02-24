package com.syntax.review6;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("e"));
        System.out.println(str.charAt(1));
        String newStr=str.concat(" friends");
        System.out.println(newStr);
        System.out.println(str);//Hello
        str=str.toLowerCase();
        System.out.println(str);//hello
        System.out.println(str.isEmpty());

        String str1="  Review B15  ";
        String newStr1=str1.trim();// it removes any leading or trailing white spaces
        System.out.println(str1);
        System.out.println(newStr1);
    }
}
