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
    public ArrayList<Subject> subjects = new ArrayList<>(20);

    
    public Diary(String c_name){
        this.className=c_name;
    }
    
    public void addToDiary(Subject subject){
            subjects.add(subject);
    }
    
    public void showDiary(){
        System.out.println(className);
        //printing subjects
    for(int i =0; i<subjects.size();i++){
        
        System.out.println(subjects.get(i).subjectName);
        //printing students
        for(int j=0; j<subjects.get(i).students.size();j++){
            
            System.out.print((j+1)+"."+subjects.get(i).students.get(j).name + " "
            + subjects.get(i).students.get(j).lastName + " " );
           
            //printing grades
            for(int k=0; k<subjects.get(i).students.get(j).grades.size();k++){
                //printing activites
                
                 for(int m = 0; m<subjects.get(i).students.get(j).grades.get(k).activities.size();m++){
                     System.out.print(subjects.get(i).students.get(j).grades.get(k).activities.get(m)+": " );
                 }
                 System.out.print(subjects.get(i).students.get(j).grades.get(k).grade +" ");
                 
      
                
            }
            System.out.print("average: " + subjects.get(i).students.get(j).average+ " ");
            System.out.print("\n");
        }
                    
        
    }
    }
    
}
