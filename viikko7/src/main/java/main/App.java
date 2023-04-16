// Tekijä: Sami Anttalainen
// Opiskelijanumero: 001067291
// Päivämäärä: 1.3.2023
// Tehtävä: Viikko 7 Harjoitustehtävä

package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Tervetuloa gifu-järjestelmään");
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        String name = Scan.nextLine();
        Gifu gifu = new Gifu(name);

        boolean Stop = false;

        while (!Stop) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");

            int choice = Integer.parseInt(Scan.nextLine());

            if (choice == 1) {
                System.out.println("Anna kurssin nimi:");
                String courseName = Scan.nextLine();
                System.out.println("Anna kurssin ID:");
                String courseID = Scan.nextLine();
                System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                int maxStudents = Integer.parseInt(Scan.nextLine());
                Course newCourse = new Course(courseName, courseID, maxStudents);
                gifu.addCourse(newCourse);
            }

            else if (choice == 2) {
                System.out.println("Anna opiskelijan nimi:");
                String newStudent = Scan.nextLine();
                System.out.println("Anna opiskelijan opiskelijanumero:");
                String studentId = Scan.nextLine();
                Student newStud = new Student(newStudent, studentId);
                gifu.addStudent(newStud);
            }

            else if (choice == 3) {
                gifu.listCourses();
            }

            else if (choice == 4) {
                gifu.listStudents();
            }

            else if (choice == 5) {
                gifu.listCourses();
                System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                int choice1 = Integer.parseInt(Scan.nextLine());
                gifu.listStudents();
                System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                int choice2 = Integer.parseInt(Scan.nextLine());
                gifu.enrollStudent(gifu.getStudent(choice2), gifu.getCourse(choice1));
            }

            else if (choice == 6) {
                gifu.listCourses();
                System.out.println("Minkä kurssin haluat arvostella? Syötä kurssin numero:");
                int choice1 = Integer.parseInt(Scan.nextLine());
                gifu.setGrade(gifu.getCourse(choice1), Scan);
            }

            else if (choice == 7) {
                gifu.listCourses();
                System.out.println("Minkä kurssin opiskelijat haluat listata? Syötä kurssi numero:");
                int choice1 = Integer.parseInt(Scan.nextLine());
                gifu.getEnrollments(gifu.getCourse(choice1));
            }

            else if (choice == 8) {
                gifu.listStudents();
                System.out.println("Minkä opiskelijan arvosanat haluat listata? Syötä opiskelijan numero:");
                int choice1 = Integer.parseInt(Scan.nextLine());
                gifu.getEnrollments(gifu.getStudent(choice1));
            }

            else if (choice == 9) {
                gifu.listEnrollments();
            }

            else if (choice == 0) {
                Scan.close();
                System.out.println("Kiitos ohjelman käytöstä.");
                Stop = true;
            }

            else {
                System.out.println("Syöte oli väärä");
            }
        }

    }
}
