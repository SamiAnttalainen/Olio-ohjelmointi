// Tekijä: Sami Anttalainen
// Päivämäärä: 1.2.2023
// Opiskelijanumero: 001067291
// Tehtävä: Eläintarha


package main;


public class Animal {
    String animalName;
    String animalRace;
    int animalAge;

    public Animal(String animalName, String animalRace, int animalAge) { // Sets animal's name, race and age.
        this.animalName = animalName;
        this.animalRace = animalRace;
        this.animalAge = animalAge;
    }
    
    public void animalRun(int Round) { // Makes animal run
        int Time = 0;
        while (Time < Round) {
            System.out.println(animalName + " juoksee kovaa vauhtia!");
            Time++;
        }
    }


}
