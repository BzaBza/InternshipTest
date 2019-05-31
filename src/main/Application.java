package main;

import java.util.ArrayList;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        String[] dbResult = {"Andrew Kostenko","Maria Perechrest","Julia Veselkina"};
        String[] fileResult = { "Arthur Boshkof", "Igor Boshkof", "Ignat Boshkof" };
      
        University university = new University("CH.U.I.");

        if(dbResult != null){
            for( int i = 0; i < dbResult.length; i++){
                university.addStudent(new Student(dbResult[i]));
            }
        }
        if(fileResult != null){
            for( int i = 0; i < fileResult.length; i++){
                university.addStudent(new Student(fileResult[i]));
            }
        }

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents(university));
    }
}
