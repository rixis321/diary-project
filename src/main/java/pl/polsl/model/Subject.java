/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;
import java.util.ArrayList;

/**
 * Class that represents subject. Its storying the information about name of subject
 * and students
 * 
 * @author Konrad Sygut
 * @version 1.0
 */
public class Subject {
    //fields
    
    /**
     * Represents the name of the subject
     */
    private String subjectName;
    
    /**
     * ArrayList for storaging Student objects
     */
    private ArrayList<Student> students = new ArrayList<>(20);
    
    
    
    
    //methods
    
     /**
     * class constructor with 1 parameter.
     * @param subjName name of the subject
     */
    public Subject(String subjName){
        this.subjectName = subjName;
        
    }
     /**
     * default class constructor 
     */
    public Subject(){};
    
  
      /**
     * Method that adds Student object to students ArrayList
     * @param stud Student object 
     */
    public void  addStudent(Student stud){
        students.add(stud);
    }
    
    /**
     * Method that sets name of the subject
     * @param subName name of the subject 
     */
    public void setSubjectName(String subName){
        this.subjectName = subName;
    }
    
    
    /**
     * Method that returns the name of subject
     * @return name of the subject
     */
    public String getSubName(){
        return this.subjectName;
    }
    
    
    /**
     * Method that returns the ArrayList of the Student objects
     * @return name of the subject
     */
    public ArrayList<Student> getStudents(){
    return this.students;
    }
    
    
    
    
}
