// Tekijä: Sami Anttalainen
// Päivämäärä: 9.2.2023
// Tehtävä: Yliopisto tietokanta

package main;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner Scan = new Scanner(System.in);
        Student newStudent = null;
        University university = new University();
        Calculator calculator = new Calculator();
        
        boolean Stop = false;
        while (!Stop) {

            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            if (Scan.hasNext()) {
                int Choice = 0;
                Choice = Integer.parseInt(Scan.nextLine());

                if (Choice == 1) {
                    System.out.println("Anna opiskelijan nimi?");
                    String stringName = Scan.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String stringId = Scan.nextLine();
                    newStudent = new Student(stringName, stringId);
                    university.addStudent(newStudent);
                    
                } else if (Choice == 2) {
                    university.showStudents();

                } else if (Choice == 3) {
                    university.listStudents();
                    System.out.println("Mille opiskelijalle suorite lisätään?");
                    int Index = Integer.parseInt(Scan.nextLine());
                    System.out.println("Mille kurssille suorite lisätään?");
                    String stringCourse = Scan.nextLine();
                    System.out.println("Mikä arvosana kurssille lisätään?");
                    int Grade = Integer.parseInt(Scan.nextLine());
                    university.addCourse(Index, stringCourse, Grade);

                } else if (Choice == 4) {
                    university.listStudents();
                    System.out.println("Minkä opiskelijan suoritteet listataan?");
                    int Index = Integer.parseInt(Scan.nextLine());
                    university.listCourses(Index);

                } else if (Choice == 5) {
                    university.listStudents();
                    System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                    int Index = Integer.parseInt(Scan.nextLine());
                    Student uStudent = university.getStudent(Index);
                    double Gpa = calculator.getAverageGrade(uStudent);
                    System.out.println("Keskiarvo on " + Gpa);

                } else if (Choice == 6) {
                    university.listStudents();
                    System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                    int Index = Integer.parseInt(Scan.nextLine());
                    Student uStudent = university.getStudent(Index);
                    double Median = calculator.getMedianGrade(uStudent);
                    System.out.println("Mediaani on " + Median);

                } else if (Choice == 7) {
                    university.saveStudents();

                } else if (Choice == 8) {
                    university.loadStudents();

                } else if (Choice == 0) {
                    System.out.println("Kiitos ohjelman käytöstä.");
                    Scan.close();
                    Stop = true;

                } else {
                    System.out.println("Syöte oli väärä");
                }
            }
        }
    }
}
