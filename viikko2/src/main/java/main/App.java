// Tekijä: Sami Anttalainen
// Päivämäärä: 24.1.2023
// Tehtävä: Siiliolio

package main;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Hedgehog hedgehog = new Hedgehog();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in); // Avataan skanneri tekstin lukua varten

        while(!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            
            if (scanner.hasNext()) {
                int Choice = 0;
                String string = scanner.nextLine();
                Choice = Integer.parseInt(string);

                switch(Choice) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String text = scanner.nextLine();
                        hedgehog.hedgehogSpeak(text);
                        break;

                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = scanner.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String stringAge = scanner.nextLine();
                        int age = Integer.parseInt(stringAge);
                        hedgehog = new Hedgehog(name, age);
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        String stringRound = scanner.nextLine();
                        int round = Integer.parseInt(stringRound);
                        hedgehog.hedgehogRun(round);
                        break;
                    
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        scanner.close(); // Suljetaan skanneri muistin säästämiseksi
                        exit = true; // Poistutaan loopista muuttamalla arvo
                        break;

                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
    }

}
