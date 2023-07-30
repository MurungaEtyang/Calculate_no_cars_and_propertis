package org.example;

public class Car extends Vehicle{


    private int numDoors;
    public Car(String manu, int year, int numDoors){
        super(manu, year);
        this.numDoors = numDoors;
    }

    public void openDoors(){
        System.out.println("Opening car doors");
    }
}
