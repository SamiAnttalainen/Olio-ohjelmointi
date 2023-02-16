package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    String studentName;
    String studentID;
    public ArrayList<String> Courses = new ArrayList<>();
    public ArrayList<Integer> Grades = new ArrayList<>();
    String Course;
    int Grade;

    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public void addGrade(String Course, int Grade) {
        Courses.add(Course);
        Grades.add(Grade);
    }
}
