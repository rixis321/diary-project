/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


        
package pl.polsl.model;
import java.util.ArrayList;

/**
 * Class that represents grade. Its storying the activities(e.g. spr,egz,kartk,odp) of a student.
 * 
 * @author Konrad Sygut
 * @version 1.0
 */
public class Grade {
    //fields 
    
    /**
     * represent a grade of a student 
     */
   private float grade;
   
   /**
     * represent a wage. Its used for calculating a grade
     */
   private float wage;
   
   
   //methods
   
   
   /**
     * An ArrayList that stores activites which are the string value.
     */
   private ArrayList<String> activities = new ArrayList<>();
   
   /**
     * class constructor with 2 parameters. Its calculating the wage of a grade
     * based on activity of a student
     * @param g grade of a student
     * @param act activity of a student
     */           
   public Grade(float g, String act){
       
       this.grade = g;
       this.activities.add(act);
       switch (act) {
           case "kartk":
               this.wage = (float) 0.4;
               break;
           case "odp":
               this.wage = (float)0.6;
               break;
           case "egz":
               this.wage = (float)0.8;
               break;
           case "akt":
               this.wage = (float)0.2;
               break;
           default:
               this.wage = 1;
               break;
       }
       
   }
    /**
     * defualt class constructor
     */ 
   public Grade(){};
   
   
       /**
        * Method that sets grade of an Grade object
        * @param g grade of the student 
       */ 
        public void setGrade(float g){
            this.grade = g;
        }
   
       /**
        * Method that returns the grade in float number
        * @return grade in float type
       */ 
        public float getGrade(){
            return this.grade;
        }

         /**
        * Method that returns the wage of the grade
        * @return wage of the grade
       */ 
        public float getWage(){
           return this.wage;
        }

         /**
        * Method that returns the ArrayList of the activites
        * @return ArrayList of the activites
         */ 
        public ArrayList<String> getActivities(){
            return this.activities;
        }
   

   
   
  
}
