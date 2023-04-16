package main;

public class Plane extends Vehicle {


    public Plane(String Manufacturer, String Model, int maxSpeed) {
        super("Lentokone", Manufacturer, Model, maxSpeed);
    }
    public void fly() {
        System.out.print(Manufacturer + " " + Model + " lentää kohteeseen!");
    }   
}
