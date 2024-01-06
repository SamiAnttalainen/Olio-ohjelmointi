// Tekijä: Sami Anttalainen
// Päivämäärä: 1.3.2023
// Tehtävä: Viikko 7 Harjoitustehtävä

package main;

public class Enrollment extends Gifu {

    private int grade;
    private Course course;
    private Student student;

    public Enrollment(String university, int grade, Course course, Student student) {
        super(university);
        this.grade = grade;
        this.course = course;
        this.student = student;
    }

    public void gradeCourse(int grade) {
        this.grade = grade;
    }
    
    public int getGrade() {
        return grade;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }
}
