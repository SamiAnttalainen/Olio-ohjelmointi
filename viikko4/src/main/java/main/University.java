package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {
    public ArrayList<Student> Students = new ArrayList<>();
    private String FILENAME;

    public University() {
        FILENAME = "Opiskelijat.txt";
    }


    public void addStudent(Student student) {
        Students.add(student);
    }

    public void showStudents() {
        System.out.println("Opiskelijat:");
        for (Student student : Students) {
            System.out.println(student.studentID + ": " + student.studentName);
        }
    }

    public void listStudents() {
        int Index = 0;
        for (Student student : Students) {
            System.out.println(Index++ + ": " + student.studentName);
        }
    }

    public void addCourse(int Index, String Course, int Grade) {
        Student student = Students.get(Index);
        student.addGrade(Course, Grade);
    }

    public void listCourses(int Index) {
        Student student = Students.get(Index);
        int Length = student.Courses.size();
        for (int i = 0; i < Length;  i++) {
            System.out.println(student.Courses.get(i) + ": " + student.Grades.get(i));
        }
    }
    public Student getStudent(int Index) {
        return Students.get(Index);
    }

    public void saveStudents() {
        try {
            ObjectOutputStream writeStudents = new ObjectOutputStream(new FileOutputStream(FILENAME));
            writeStudents.writeObject(Students);
            writeStudents.close();
        } catch (IOException Error) {
            System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
            Error.printStackTrace();
        }
    }
    
    public void loadStudents() {
        try {
            ObjectInputStream readStudents = new ObjectInputStream(new FileInputStream(FILENAME));
            Students = (ArrayList<Student>) readStudents.readObject();
            readStudents.close();
        } catch (IOException Error) {
            System.out.println("Opiskelijoiden tietojen lukeminen ei onnistunut");
        } catch (ClassNotFoundException e) {
            System.out.println("Opiskelijoiden tietojen lukeminen ei onnistunut");
            e.printStackTrace();
        }
    }
}
