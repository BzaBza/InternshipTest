package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Maria Perechrest"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Arthur Boshkof"));
        university.addStudent(new Student("Igor Boshkof"));
        university.addStudent(new Student("Ignat Boshkof"));
        university.addStudent(new Student("Sem Boshkof"));

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents(university));
    }
}
