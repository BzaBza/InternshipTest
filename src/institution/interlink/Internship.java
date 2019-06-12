package institution.interlink;

import java.util.ArrayList;

import person.Student;
import institution.University;

public class Internship {
    private ArrayList<Student> students = new ArrayList<>();
    private int gpa;
    private String internshipName;

    public Internship(String name) {
        internshipName = name;
    }

    public String getName() {
        return internshipName;
    }

    private void setStudent(Student student) {
        if (student.getKnowledgeValue() > gpa) {
            students.add(student);
        }
    }

    public ArrayList<String> getStudents(University university) {
        ArrayList<String> names = new ArrayList<>();
        gpa = university.gpaCounter();
        university.getStudents().forEach(this::setStudent);
        for (Student student : students) {
            names.add(student.getStudentName());
        }
        return names;
    }
}
