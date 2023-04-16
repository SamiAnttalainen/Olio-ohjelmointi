package main;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner Scan = new Scanner(System.in);
        Vehicle newVehicle = new Vehicle(null, null, null, 0);

        boolean Stop = false;

        while (!Stop) {

            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");

            if (Scan.hasNext()) {
                int Choice = Integer.parseInt(Scan.nextLine());


                if (Choice == 1) {
                    newVehicle.addVechicle(Scan);
                }

                else if (Choice == 2) {
                    newVehicle.listVehicles();
                }

                else if (Choice == 3) {
                    newVehicle.driveCars();
                }

                else if (Choice == 4) {
                    newVehicle.flyPlanes();
                }

                else if (Choice == 5) {
                    newVehicle.sailShips();
                }

                else if (Choice == 0) {
                    Scan.close();
                    System.out.println("Kiitos ohjelman käytöstä.");
                    Stop = true;
                }
                else {
                    System.out.println("Syöte oli väärä");
                }
            }
        }
    }
}
