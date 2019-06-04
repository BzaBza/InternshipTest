package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import server.FileStudentsReceiver;
import server.StudentsReceiver;

public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");
        StudentsReceiver studentsReceiver = new FileStudentsReceiver();
        if (studentsReceiver.getStudents() != null) {
            for (int i = 0; i < studentsReceiver.getStudents().length; i++) {
                university.addStudent(new Student(studentsReceiver.getStudents()[i]));

            }
        }


        Internship internship = new Internship("Interlink");
        System.out.println("List of " + internship.getName() + " internship's students:");
        System.out.println(internship.getStudents(university));
    }
}
