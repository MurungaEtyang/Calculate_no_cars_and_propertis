package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", 2019);
        Car car = new Car("Toyota", 2019, 4);
//        vehicle.accelerate();
//        vehicle.brake();
        System.out.println(vehicle.toString());
    }
}
