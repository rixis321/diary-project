/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.controler;
//V-pokazywaniedanych
//M - zaobliczeania

import java.util.Scanner;
import pl.polsl.model.Diary;
import pl.polsl.model.Subject;
import pl.polsl.view.DiaryView;

/**
 *
 * @author SuperStudent.PL
 */
public class Controler {
    
    private Diary model;
    private DiaryView view;
    
    
    public Controler(Diary d, DiaryView dw){
        this.model = d;
        this.view = dw;
    }
    
    public void addToDiary(Subject sub){
    this.model.addSubject(sub);
    }
    
    public void updateView(){
        view.showDiary(this.model);
    }
    
    public void checkInput(String args[]){
        
        int numberOfParameters = args.length;
        
        String name;
        String lastName;
        String subject;
        String activity;
        float grade;
        boolean error = false;
      
        if(numberOfParameters == 5){
            try{
                name = args[0];
                lastName = args[1];
                subject = args[2];
                activity = args[3];
                grade = Float.parseFloat(args[4]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                error = true;
                System.err.println("No arguments !!!");

                    }
            
         }
         else if(numberOfParameters > 0 && numberOfParameters < 5){
             System.out.println("Not enough parameters");
         }
         else{
             System.out.println("No parameters"); 
         }
                
              
              
     
  
        
        
    }
}
