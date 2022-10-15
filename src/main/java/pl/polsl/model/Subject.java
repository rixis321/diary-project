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
    
    public String subjectName;
    public ArrayList<Student> students = new ArrayList<>(20);
    
    public Subject(String subjName){
        this.subjectName = subjName;
        
    }
    public void  AddStudent(Student stud){
        students.add(stud);
    }
    
    
}
