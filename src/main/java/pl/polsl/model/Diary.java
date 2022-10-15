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
    
    
    public String className;   
    public ArrayList<Subject> subjects = new ArrayList<>(20);

    
    public Diary(String c_name){
        this.className=c_name;
    }
    
    public void addToDiary(Subject subject){
            subjects.add(subject);
    }
    
    public void showDiary(){
    for(int i =0; i<subjects.size();i++){
        System.out.println(subjects.get(i).subjectName);
    }
    }
}
