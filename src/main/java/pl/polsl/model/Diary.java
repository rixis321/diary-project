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
    
    public String getClassName(){
    return this.className;
    }
    
    public void addSubject(Subject subject){
            subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects(){
        return subjects;
    } 
   
    
}
