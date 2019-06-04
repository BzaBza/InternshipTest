package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.Random;

public class University {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Integer> knowledgePoints = new ArrayList<>();
    private String universityName;

    public University(String name) {
        universityName = name;
    }

    public String getName() {
        return universityName;
    }

    public void setStudent(Student student) {
        students.add(student);
        knowledgePoints.add(student.getKnowledgeValue());
    }

    public void addStudent(Student student) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        student.setKnowledge(new Knowledge(randomNum));
        setStudent(student);
    }

    public Integer gpaCounter() {
        int gpa = knowledgePoints.stream().mapToInt(i -> i.intValue()).sum() / knowledgePoints.size();
        return gpa;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

}
