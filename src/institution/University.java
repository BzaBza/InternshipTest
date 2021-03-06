package institution;

import person.Student;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students = new ArrayList<>();
    private int knowledgePoints ;
    private String universityName;

    public University(String name) {
        universityName = name;
    }

    public String getName() {
        return universityName;
    }

    private void setStudent(Student student) {
        int knowledgeSum = 0;
        students.add(student);
        for (Student student1 : students) {
            knowledgeSum += student1.getKnowledgeValue();
        }
        knowledgePoints = knowledgeSum;
    }

    public void addStudent(Student student) {
        setStudent(student);
    }

    public Integer gpaCounter() {
        return knowledgePoints / students.size();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

}
