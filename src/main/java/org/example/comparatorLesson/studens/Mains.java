package org.example.comparatorLesson.studens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mains {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex",19,7.0));
        students.add(new Student("Elena",18,8.2));
        students.add(new Student("Nik",17,5.0));
        students.add(new Student("Bob",22,9.1));
        students.add(new Student("Snoop",19,7.1));
        students.add(new Student("Dog",19,10.0));


        Comparator<Student> comparator = Comparator.comparing(Student::getAssessment);
        Collections.sort(students, comparator);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
