package com.syntax.review7;

public class Methods {
    // user defined : with return type and without (void)
    //              : with parameters and without(madifier and data type)
    void hello() {
        System.out.println("Hello");
    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }
    // create a method that returns the largest number between given 2 integer values
    int findLargest(int num1,int num2){// first way
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }}

        int find2Largest(int num3,int num4){// second way
            int largest;
            if (num3>num4){
                largest=num3;
            }else {
                largest=num4;
            }return largest;
    }
    double findAvrage(double num1, double num2){
        return (num1+num2)/2;
    }
    // returns reverse String from a given String value
    String reverse1(String str){// first way of reverse. true but usually use second way of reverse string as below code
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }return sb.reverse().toString();
    }
    String reverse2(String given){// second way of reverse
        StringBuilder sb1=new StringBuilder(given);
        return sb1.reverse().toString();
    }
    // create a method that will return a minimum value from given array
    int minValue(int [] numbers){// first way of min value of array
        int min=numbers[0];// you can add 0 only instead of numbers[0]
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]<=numbers[0]){
                min=numbers[i];
            }
        }return min;
    }
    /* int minVal(int[] a){
        int min=a[0];
        for (int i=0; i<a.length; i++){///  something is wrong with this
            if(a[i]<i){
                min=a[i];
            }
        }
        return min;
    }*/


    public static void main(String[] args) {
        String name="Muhammed";
        int characters=name.length();

        Methods obj=new Methods();
        obj.sayHello(name);
        Methods obj2=new Methods();
        System.out.println(obj2.findLargest(10,20));
        System.out.println(obj2.findAvrage(10,30));
        System.out.println(obj.reverse1("Java"));
        System.out.println(obj.reverse2("Cabbar"));

        String myString="Batch15";
        boolean empty=myString.toUpperCase().isEmpty();// convert your string value to boolean(will be false)
        System.out.println(empty);
        char letter=myString.trim().charAt(2);// convert your string value to boolean (will be t)
        System.out.println(letter);
        System.out.println(obj.minValue(new int[]{10,5,2}));
        /*System.out.println(obj.minVal(new int[]{10,5,20}));*/ // because something is wrong
    }
}
    // static method belongs to the class rather than the "instance"