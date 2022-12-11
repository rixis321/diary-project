/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;
import java.util.ArrayList;

/**
 * Class that represents student. Its storying the information about student
 * and his grades.
 * @author Konrad Sygut
 * @version 2.0
 */
public class Student {
    //fields
    
    /**
     * Represent name of the student
     */
   private String name;
   
   /**
     * Represent lastname of the student
     */
   private String lastName;
   
   /**
     * An ArrayList that stores Grade objects  of the student
     */
   public ArrayList<Grade> grades = new ArrayList<>(20);
   
   /**
     * Represent average grade of the student 
     */
   public float average;
    
    //methods 
   
   /**
     * class constructor with 2 parameters.
     * @param n name of the student
     * @param lname lastname of the student
     */
    public Student(String n, String lname){
        
        this.name = n;
        this.lastName =lname;
       
    }
    
    /**
     * default constructor
     */
    public Student(){};
    
    
    /**
     * Method that adds Grade object to an ArrayList of the grades
     * @param grd grade of the student
     */
    public void addGrade(Grade grd){
        grades.add(grd);
 
    }
    
    /**
     * Method that sets the name of the student
     * @param name student name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Method that returns the name of an student object
     * @return the name of the student
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Method that sets the lastname of the student
     * @param lname student lastname
     */
    public void setLastName(String lname){
        this.lastName = lname;
    }
    
    /**
     * Method that returns the lastname of an student object
     * @return last name of the student 
     */
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     * Method that calculate the average grade based on ArrayList of grade objects
     * @param g ArrayList of grades
     */
    public void calcAvg(ArrayList<Grade> g){
        float sum = 0;
        
        for(Grade grad : g){
           sum+= grad.getGrade() * grad.getWage();
        }
        
   
        this.average = sum/g.size();
        this.average *=100;
        this.average = Math.round(this.average);
        this.average /=100;
       
    
    }

    
    
}
