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
    
   
   private float wage;
   public ArrayList<String> activities = new ArrayList<>();
   
   
   public Grade(){
       activities.add("kartk");
       activities.add("odp");
       activities.add("egz");
       activities.add("akt");
       this.wage = 0;
   }
   
  
}
