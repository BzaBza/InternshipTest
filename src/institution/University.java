package institution;

import java.util.Random;
import person.Student;
import person.consciousness.Knowledge;
import java.util.ArrayList;
import java.util.stream;

public class University {
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Integer> knowledgePoints = new ArrayList<Integer>();
    public University(String name) {
        //TODO: Implementation is needed
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
    public Integer gpaCounter(){
        int gpa = knowledgePoints.stream()
                    .mapToInt(i -> i.intValue())
                    .sum() / knowledgePoints.size();
        return gpa;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }

}
