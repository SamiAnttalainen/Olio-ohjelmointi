// Tekijä: Sami Anttalainen
// Päivämäärä: 1.3.2023
// Tehtävä: Viikko 7 Harjoitustehtävä

package main;


public class Student extends Gifu implements PrintInfo{
    
    private String name;
    private String id;
    private String info;

    public Student(String name, String id) {
        super("LUT");
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }

    @Override
    public String getInformation() {
        info = id + " " + name;
        return info;
    }
}
