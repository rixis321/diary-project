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
   public int year;
   public ArrayList<Grade> grades = new ArrayList<>(20);
    
    
    public Student(String n, String lname){
        
        this.name = n;
        this.lastName =lname;
       
    }
    
}
