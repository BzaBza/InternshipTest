package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;
import server.FileStudentsReceiver;
import server.StudentsReceiver;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");
        StudentsReceiver studentsReceiver = new FileStudentsReceiver();
        if (studentsReceiver.getStudents() != null) {
            for (int i = 0; i < studentsReceiver.getStudents().length; i++) {
                Random rand = new Random();
                int randomNum = rand.nextInt((10 - 1) + 1) + 1;
                university.addStudent(new Student(studentsReceiver.getStudents()[i], randomNum));
            }
        }


        Internship internship = new Internship("Interlink");
        System.out.println("List of " + internship.getName() + " internship's students:");
        System.out.println(internship.getStudents(university));
    }
}
