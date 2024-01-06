// Tekijä: Sami Anttalainen
// Päivämäärä: 1.3.2023
// Tehtävä: Viikko 7 Harjoitustehtävä

package main;

public class Course extends Gifu implements PrintInfo{
    private int maxNumberOfStudents;
    private String name;
    private String id;
    private String info;

    public Course(String name, String id, int maxNumberOfStudents) {
        super("LUT");
        this.maxNumberOfStudents = maxNumberOfStudents;
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
