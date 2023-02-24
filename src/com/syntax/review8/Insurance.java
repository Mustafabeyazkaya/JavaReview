package com.syntax.review8;

public abstract class Insurance {
    // we can not create object of abstract class
    // Can i have variables inside abstract class? - YES
    public static String company="Geico";
    protected String policyNumber;
    String policyHolder;
    // Can i have constructor inside abstract class? - YES
    public Insurance(String policyNumber,String policyHolder){// all constructor are with us to initialize object
        this.policyHolder=policyHolder;
        this.policyNumber=policyNumber;
    }
    public void getInsurance(){
        System.out.println("We need to get insurance");
    }
    public abstract double calculateCoverage();
}
class CarPolicy extends Insurance{
    double premium;
    int age;
    CarPolicy (String policyNumber,String policyHolder,double premium, int age){// within child class of abstract, we need to have constructor as parent class
        super(policyNumber,policyHolder);
        this.age=age;
        this.premium=premium;
    }
    // to provide implementation, we need to follow rules of overriding
    @Override
    public double calculateCoverage() {// we call this abstract method from parent class in every child class to implement differently
        if (age<20){
            return premium*2;
        } else if (age<40) {
            return premium * 0.5;
        }else {
        return premium*0.2;
    }
    }
}
class PetPolicy extends Insurance{
    int numberOfPets;
    double premium;
    PetPolicy(String policyNumber,String policyHolder,int numberOfPets,double premium){
        super(policyNumber,policyHolder);
        this.numberOfPets=numberOfPets;
        this.premium=premium;
    }
    @Override
    public double calculateCoverage() {// we call this abstract method from parent class in every child class to implement differently
        if (numberOfPets>2){
            return premium*2;
        } else if (numberOfPets>5) {
            return premium*3;
        }else {
            return premium*5;
        }
    }
}
