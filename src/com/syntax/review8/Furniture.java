package com.syntax.review8;

public class Furniture {
    public void assemble(){
        System.out.println("Furniture needs to be assembled");
    }
    public void comfort(){
        System.out.println("Furniture need to be comfortable");
    }
    private void use(){
        System.out.println("Furniture is used by humans");
    }
    public static void breaks(){
        System.out.println("Furniture breaks");
    }
}
class Chair extends Furniture{
    //@Override we can not override static method
    public static void breaks(){// we are not overriding , we just declaring a new and own methods, as static
        System.out.println("Chair can break too");
    }
    //@Override we can not override private method
    private void use(){// we are not overriding we just declaring a new and own methods, as private
        System.out.println("Chair used by human to seat");
    }
    @Override
    public void comfort() {
        System.out.println("Not every chair is comfortable");
    }
    protected void loveSeat(){
        System.out.println("This is the best chair");
    }// you can have a local(OWN) methods inside the child class which parent class even don't care
}
class Table extends Furniture{
    public void comfort(){
        System.out.println("Tables can not be comfortable");
    }
    public void assemble(){
        System.out.println("Our tables are assembled");
    }
    protected void buildTable(){
        System.out.println("We can easily build a table");
    }
    void buildTable(String material){
        System.out.println("We build table from "+material);
    }
}