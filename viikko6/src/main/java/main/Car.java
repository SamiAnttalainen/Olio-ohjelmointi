package main;


public class Car extends Vehicle{


    public Car(String Manufacturer, String Model, int maxSpeed) {
        super("Auto", Manufacturer, Model, maxSpeed);

    }

    public void drive() {
        System.out.println(Manufacturer + " " + Model + " paahtaa tietä eteenpäin!");
    }
    
}
