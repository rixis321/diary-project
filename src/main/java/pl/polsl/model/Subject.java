/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;

import java.util.ArrayList;

/**
 *
 * @author zento
 */
public class Subject {
    
    private String subjectName;
    private ArrayList<Student> students = new ArrayList<>(20);
    
    public Subject(String subjName){
        this.subjectName = subjName;
        
    }
    
    public Subject(){};
    
    public void  addStudent(Student stud){
        students.add(stud);
    }
    
    public void setSubjectName(String subName){
        this.subjectName = subName;
    }
    
    public String getSubName(){
        return this.subjectName;
    }
    
    public ArrayList<Student> getStudents(){
    return students;
    }
    
    
    
    
}
