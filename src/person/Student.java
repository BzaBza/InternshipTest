package person;

import person.consciousness.Knowledge;

public class Student {
    private int knowledgeValue;
    private String studentName;
    public Student(String name) {  
        studentName = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        knowledgeValue = knowledge.getKnowledge();
    }
    public Integer getKnowledgeValue(){
        return knowledgeValue;
    }
    public String getStudentName(){
       return studentName;
    }
}
