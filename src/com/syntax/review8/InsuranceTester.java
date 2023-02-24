package com.syntax.review8;

public class InsuranceTester {
    public static void main(String[] args) {
    // can i create an object of Insurance class? - NO, because it is abstract , because it has something is not completed
        // only you can have object of Insurance class by looping child class by upcasting, like below code
     Insurance carPolicy=new CarPolicy("I969696","John Smith",200,22);
     carPolicy.getInsurance();
     System.out.println(carPolicy.calculateCoverage());


     Insurance petPolicy=new PetPolicy("P969696","Olena L",4,20);
     petPolicy.getInsurance();
     System.out.println(petPolicy.calculateCoverage());


     Insurance [] policies={
             new CarPolicy("I969696","John Smith",200,2),
             new PetPolicy("P969696","Olena L",2,20),
             new CarPolicy("I969697","Asel",200,20),
             new PetPolicy("P969697","Daria",5,20)
     };
        for (int i = 0; i < policies.length; i++) {
            System.out.println(policies[i].calculateCoverage());
        }
}
}
