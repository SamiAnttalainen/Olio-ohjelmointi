// Tekijä: Sami Anttalainen
// Päivämäärä: 1.2.2023
// Opiskelijanumero: 001067291
// Tehtävä: Eläintarha

package main;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner Scan = new Scanner(System.in); // Open a scanner.
        Zoo zoo = new Zoo(null);
        ArrayList<Animal> Animals = new ArrayList<>();
        System.out.println("Anna eläintarhalle nimi:");
        String zooName = Scan.nextLine();
        zoo = new Zoo(zooName);


        boolean Stop = false;
        while (!Stop) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if (Scan.hasNext()) {
                int Choice = 0;
                String scanString = Scan.nextLine();
                Choice = Integer.parseInt(scanString);

                if (Choice == 1) {
                    System.out.println("Mikä laji?");
                    String animalRace = Scan.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    String animalName = Scan.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    String stringAge = Scan.nextLine();
                    int animalAge = Integer.parseInt(stringAge);
                    Animals.add(new Animal(animalName, animalRace, animalAge)); // Adds a new animal to the Animals list.

                } else if (Choice == 2) {
                    System.out.println(zoo.zooName + " pitää sisällään seuraavat eläimet:");
                    for (Animal Beast : Animals) { // Loop checks every animal in the object list and makes them speak.
                        System.out.println(Beast.animalRace + ": " + Beast.animalName + ", " + Beast.animalAge + " vuotta"); 
                    }
                } else if (Choice == 3) {
                    System.out.println("Kuinka monta kierrosta?");
                    String stringRound = Scan.nextLine();
                    int Round = Integer.parseInt(stringRound);
                    for (Animal Beast : Animals) { // Loop checks every animal in the object list and makes them run.
                        Beast.animalRun(Round);
                    }
                } else if (Choice == 0) {
                    System.out.println("Kiitos ohjelman käytöstä.");
                    Scan.close(); // Close the scanner.
                    Stop = true;
                } else {
                    System.out.println("Syöte oli väärä");
                }
            }
        }
    }
}
