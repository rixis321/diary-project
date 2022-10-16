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
public class Grade {
    
   private float grade;
   private float wage;
   private ArrayList<String> activities = new ArrayList<>();
   
   
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
   
   public Grade(){};
   
   public void setGrade(float g){
       this.grade = g;
   }
   
   public float getGrade(){
       return this.grade;
   }
   
   public float getWage(){
      return this.wage;
   }
   
   public ArrayList<String> getActivities(){
       return this.activities;
   }
   

   
   
  
}
