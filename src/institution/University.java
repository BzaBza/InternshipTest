package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.Random;

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
        students.add(student);
        knowledgePoints += student.getKnowledgeValue();
    }

    public void addStudent(Student student) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        student.setKnowledge(new Knowledge(randomNum));
        setStudent(student);
    }

    public Integer gpaCounter() {
        return knowledgePoints / students.size();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

}
