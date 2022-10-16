/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


        
        
package pl.polsl.model;

import java.util.ArrayList;


/**
 *
 * @author SuperStudent.PL
 */
public class Diary {
    
    
    private String className;   
    private ArrayList<Subject> subjects = new ArrayList<>(20);

    
    public Diary(String c_name){
        this.className=c_name;
    }
    
    public Diary(){};
    
    public void setClassName(String name){
        this.className = name;
    }
    
    public boolean isEmpty(){
       return this.getSubjects().isEmpty();
        
    }
    
    public int getSize(){
        return this.subjects.size();
    }
    
    public String getClassName(){
    return this.className;
    }
    
    public void addSubject(Subject subject){
            subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects(){
        return subjects;
    } 
    
    public void addStudentToSubject(int index,String name, String lname, String act,float g){
        Student student = new Student(name,lname);
        Grade grd = new Grade(g,act);
        student.addGrade(grd);
        student.calcAvg(student.grades);
        
        for(int i = 0; i< subjects.size();i++){
            this.subjects.get(index).addStudent(student);
            break;
        }
        
    }
    
    public void addData(String name,String lname, String sbj, String act,float g){
        
           Subject subj = new Subject(sbj);
           Student stud = new Student(name,lname);
           Grade grd = new Grade(g,act);
           
           grd.setGrade(g);
           stud.addGrade(grd);
           stud.calcAvg(stud.grades);
           subj.addStudent(stud);
           this.addSubject(subj);
           
           
     
    }
   
    
}
