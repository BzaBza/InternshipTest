package institution.interlink;

import java.util.ArrayList;

import person.Student;
import institution.University;

public class Internship {
    private ArrayList<String> studentName = new ArrayList<String>();
    private int gpa;
    private String internshipName;

    public Internship(String name) {
        internshipName = name;
    }

    public String getName() {
        return internshipName;
    }

    public void setStudent(Student student) {
        if (student.getKnowledgeValue() > gpa) {
            studentName.add(student.getStudentName());
        }
    }

    public ArrayList<String> getStudents(University university) {
        gpa = university.gpaCounter();
        university.getStudents().forEach(student -> setStudent(student));
        return studentName;
    }
}
