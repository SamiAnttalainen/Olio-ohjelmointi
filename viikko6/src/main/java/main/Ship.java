package main;

public class Ship extends Vehicle{



    public Ship(String Manufacturer, String Model, int maxSpeed) {
        super("Laiva", Manufacturer, Model, maxSpeed);
    }
    
    public void sail() {
        System.out.print(Manufacturer + " " + Model + " seilaa merten ääriin!");
    }
}
