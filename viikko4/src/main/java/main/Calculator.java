package main;

import java.util.ArrayList;
import java.util.Collections;

public class Calculator {

    public double getAverageGrade(Student s) {
        int Sum = 0;
        int i = 0;
        int listSize = s.Grades.size();

        if (listSize == 0) {
            double Gpa = 0;
            return Gpa;
        } else {
            for (int Grade : s.Grades) {
                Sum += Grade;
                i += 1;
            }
            double Gpa = (double) Sum / i;
            return Gpa;
        }
    }

    public double getMedianGrade(Student s) {
        double Median = 0;
        float Middle = 0;
        int listSize = s.Grades.size();
        ArrayList<Integer> Sorted = new ArrayList<>(s.Grades);
        Collections.sort(Sorted);

        if (listSize == 0) {
            return Median;
        } else {
            if (listSize % 2 == 1) {
                Median = Sorted.get(listSize / 2);
                return Median;
            } else if (listSize % 2 == 0) {
                Middle = listSize / 2;
                int Low = (int) (Middle - 1);
                int High = (int) (Middle);
                Median = (double) (Sorted.get(Low) + Sorted.get(High)) / 2;
                return Median;
            } else {
                Median = 0;
                return Median;
            }
        }
    }   
}
