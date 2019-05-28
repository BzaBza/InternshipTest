package institution.interlink;

import java.util.ArrayList;

import person.Student;
import institution.University;

public class Internship {
    private ArrayList<String> studentName = new ArrayList<String>();
    private int gpa;
    public Internship(String name) {
        //TODO: Implementation is needed
    }

    public void setStudent(Student student) {
        if(student.getKnowledgeValue() > gpa){
            studentName.add(student.getStudentName());
        }
    }

    public ArrayList<String> getStudents(University university) {
        gpa = university.gpaCounter();
        university.getStudents().forEach(student -> setStudent(student));
        return studentName;
    }
}
