/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.view;

import pl.polsl.model.Diary;


/**
 *
 * @author zento
 */
public class DiaryView {
    public void showDiary(Diary d){        
        System.out.println(d.getClassName());
        System.out.println("************************");
        //printing subjects
    for(int i =0; i<d.getSubjects().size();i++){
        
        System.out.println(d.getSubjects().get(i).getSubName());
        
        //printing students
        for(int j=0; j<d.getSubjects().get(i).getStudents().size();j++){
            
            System.out.print((j+1)+"."+d.getSubjects().get(i).getStudents().get(j).getName() + " "
            + d.getSubjects().get(i).getStudents().get(j).getLastName() + " " );
           
            //printing grades
            for(int k=0; k<d.getSubjects().get(i).getStudents().get(j).grades.size();k++){
                
                //printing activites
                 for(int m = 0; m<d.getSubjects().get(i).getStudents().get(j).grades.get(k).getActivities().size();m++){
                     System.out.print(d.getSubjects().get(i).getStudents().get(j).grades.get(k).getActivities().get(m)+": " );
                 }
                 System.out.print(d.getSubjects().get(i).getStudents().get(j).grades.get(k).getGrade() +" ");
                 
      
                
            }
            System.out.print("average: " + d.getSubjects().get(i).getStudents().get(j).average+ " ");
            System.out.print("\n");
        }
                    
        
    }
    }
    
    public void showSubjects(Diary d){
        
             for(int i =0; i<d.getSubjects().size();i++){
            System.out.println((i+1) + "." + d.getSubjects().get(i).getSubName());
        }

       
    }
    

    
}
