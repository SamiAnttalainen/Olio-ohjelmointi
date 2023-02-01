// Tekijä: Sami Anttalainen
// Päivämäärä: 24.1.2023
// Opiskelijanumero: 001067291
// Tehtävä: Siiliolio

package main;

public class Hedgehog {
    String name;
    int age;

    public Hedgehog() {
        name = "Pikseli"; // Oletussiili
        age = 5;
    }

    public Hedgehog(String name, int age) { // Antaa uuden nimen ja iän siilille parametrien kautta.
        this.name = name;
        this.age = age;
    }

    public void hedgehogSpeak(String text) { // Laittaa siilin puhumaan, jos tekstiä syötetään parametrilla, muuten toistetaan vain nimi ja ikä
        if (text.isBlank()) {
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        } else {
            System.out.println(name + ": " + text);
        }
        
    }

    public void hedgehogRun(int round) { // Laitetaan siili juoksemaan syötettyjen kierroksien verran.
        int time = 0;
        while (time < round) {
            System.out.println(name + " juoksee kovaa vauhtia!");
            time++;
        }
        
    }
}
