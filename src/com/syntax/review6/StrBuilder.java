package com.syntax.review6;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.reverse(); // i dont need to declare this code inside any variable, because this is stringbuilder it is already modifyied
        System.out.println(sb);// olleH
        String str=sb.toString();
        str=str.toUpperCase();// in this time, i gotta declare or reassing this code inside the String because String can not be modify inside
        System.out.println(str);
            }
}
