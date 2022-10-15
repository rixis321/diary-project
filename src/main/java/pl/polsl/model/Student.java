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
public class Student {
    
   public String name;
   public String lastName;
   public ArrayList<Grade> grades = new ArrayList<>(20);
   public float average;
    
    
    public Student(String n, String lname){
        
        this.name = n;
        this.lastName =lname;
       
    }
    
    public void addGrade(Grade grd){
        grades.add(grd);
 
    }
    
    public void calcAvg(ArrayList<Grade> g){
        float sum = 0;
        for(int i =0; i<g.size();i++){
            sum+= g.get(i).grade * g.get(i).wage;
            
        }
        this.average = sum/g.size();
        this.average *=100;
        this.average = Math.round(this.average);
        this.average /=100;
       
    
    }

    
    
}
