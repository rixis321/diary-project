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
    
    public String getClassName(){
        return this.model.getClassName();
    }
    
    public void addData(String name,String lname, String sbj, String act,float g){
        this.model.addData(name, lname, sbj, act, g);
    }
    
    public int checkInput(String args[]){
        
        int numberOfParameters = args.length;
        int flag = 1;
      
        if(numberOfParameters == 5){
            if(args[0].matches("[a-zA-Z]+" ) && args[1].matches("[a-zA-Z]+") 
                    && args[2].matches("[a-zA-Z]+")
                    && args[3].matches("^[a-zA-Z0-9]+$")){
                
                if(args[4].matches("[2-5]")){
                    //TODOOOOOOOOOOO przerobic funkcje na bool
                    System.out.println("Parameters are correct");
                    flag = 1;
                    
                }
                else{
                    System.out.println("Last parameter must be a number value");
                    flag = 0;
                }
            
             }
            else{
                System.out.println("The first 4 parameters must be a string value. Try again. ");
                flag = 0;
            }
            
         }
         else if(numberOfParameters > 0 && numberOfParameters > 5){
             System.out.println("Not enough parameters");
             flag = 2;
             
            
         }
         else{
             System.out.println("No parameters"); 
             flag = 2;
             
             
         }
        
        return flag;
    }
    
    public boolean checkInput(String name,String lname, String sbj, String act,String g){
        if(name.matches("[a-zA-Z]+" ) && lname.matches("[a-zA-Z]+") 
                    && sbj.matches("[a-zA-Z]+")
                    && act.matches("^[a-zA-Z0-9]+$")
                    && g.matches("[2-5]")){
             return true;
        }
        else{
             return false;
        }
        
           
        
         
           
    }
    
}
