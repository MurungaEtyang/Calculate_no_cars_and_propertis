package org.example;

public class Vehicle{

    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void accelerate(){
        System.out.println("Vehicle accelerating");

    }

    public  void  brake(){
        System.out.println("Vehicle braking");
    }

    public String toString() {
        return this.manufacturer + " (" + this.year + ")";
    }
}
