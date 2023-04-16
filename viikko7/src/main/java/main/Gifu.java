// Tekijä: Sami Anttalainen
// Opiskelijanumero: 001067291
// Päivämäärä: 1.3.2023
// Tehtävä: Viikko 7 Harjoitustehtävä

package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Gifu {
    protected String university;
    public ArrayList<Course> courses = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Enrollment> enrollments = new ArrayList<>();


    public Gifu(String university) {
        this.university = university;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void listCourses() {
        int i = 0;
        for (Course course : courses) {
            System.out.println(i++ + ") " + course.getInformation());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void listStudents() {
        int i = 0;
        for (Student student : students) {
            System.out.println(i++ + ") " + student.getInformation());
        }
    }

    public void enrollStudent(Student student, Course course) {
        Enrollment newEnroll = new Enrollment(university, -1, course, student);
        enrollments.add(newEnroll);
    }
    
    public ArrayList<Enrollment> getEnrollments(Course course) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getCourse() == course) {
                System.out.println(enrollment.getStudent().getId() + " " + enrollment.getStudent().getName() + ", arvosana: " + enrollment.getGrade());
            }
        }
        return enrollments;
    }

    public ArrayList<Enrollment> getEnrollments(Student student) {
        System.out.println("Opiskelijan " + student.getId() + " " + student.getName() + " arvosanat:");
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent() == student) {
                System.out.println(enrollment.getCourse().getId() + " " + enrollment.getCourse().getName() + ", arvosana: " + enrollment.getGrade());
            }
        }
        return enrollments;
    }

    public void listEnrollments() {
        for (Course course : courses) {
            System.out.println(course.getId() + " " + course.getName());
            for (Enrollment enrollment : enrollments) {
                if (enrollment.getCourse() == course) {
                    System.out.println(enrollment.getStudent().getId() + " " + enrollment.getStudent().getName() + ", arvosana: " + enrollment.getGrade());
                }
            }
        }
        
    }

    public void setGrade(Course course, Scanner Scan) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getCourse() == course) {
                System.out.println("Anna arvosana opiskelijalle " + enrollment.getStudent().getId() + " " + enrollment.getStudent().getName());
                int grade = Integer.parseInt(Scan.nextLine());
                enrollment.gradeCourse(grade);
            }
        } 
    }
}
