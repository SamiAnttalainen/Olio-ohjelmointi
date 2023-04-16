package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {
    protected String Type;
    protected String Manufacturer;
    protected String Model;
    protected int maxSpeed;
    ArrayList<Vehicle> Garage = new ArrayList<>();
    Engine engine = new Engine();
    
    public Vehicle(String Type, String Manufacturer, String Model, int maxSpeed) {
        this.Type = Type;
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.maxSpeed = maxSpeed;
    }

    public void addVechicle(Scanner Scan) {
        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
        int Type = Integer.parseInt(Scan.nextLine());
        System.out.println("Anna kulkuneuvon valmistaja:");
        String Producer = Scan.nextLine();
        System.out.println("Anna kulkuneuvon malli:");
        String Model = Scan.nextLine();
        System.out.println("Anna kulkuneuvon huippunopeus:");
        int Speed = Integer.parseInt(Scan.nextLine());

        if (Type == 1) {
            Car newCar = new Car(Producer, Model, Speed);
            Garage.add(newCar);
        }

        else if (Type == 2) {
            Plane newPlane = new Plane(Producer, Model, Speed);
            Garage.add(newPlane);
        }

        else if (Type == 3) {
            Ship newShip = new Ship(Producer, Model, Speed);
            Garage.add(newShip);
        }
    }

    public void listVehicles() {
        
        for (Vehicle Mobile : Garage) {
            System.out.println(Mobile.Type + ": " + Mobile.Manufacturer + " " + Mobile.Model);
            if (Mobile instanceof Car) {
                System.out.println("Moottori: " + engine.carMotor);
            }
            else if (Mobile instanceof Plane) {
                System.out.println("Moottori: " + engine.planeMotor);
            }
            else if (Mobile instanceof Ship) {
                System.out.println("Moottori: " + engine.shipMotor);
            }
            System.out.println("Huippunopeus: " + Mobile.maxSpeed + "km/h");
            System.out.println();
        }
    }

    public void driveCars() {
        for (Vehicle Car : Garage) {
            if (Car instanceof Car) {
                System.out.println(Car.Manufacturer + " " + Car.Model + " paahtaa tietä eteenpäin!");
            }
        }
    }

    public void flyPlanes() {
        for (Vehicle Plane : Garage) {
            if (Plane instanceof Plane) {
                System.out.println(Plane.Manufacturer + " " + Plane.Model + " lentää kohteeseen!");
            }
        }
    }

    public void sailShips() {
        for (Vehicle Ship : Garage) {
            if (Ship instanceof Ship) {
                System.out.println(Ship.Manufacturer + " " + Ship.Model + " seilaa merten ääriin!");
            }
        }
    }
}
