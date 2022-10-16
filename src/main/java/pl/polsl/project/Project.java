/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pl.polsl.project;

import java.util.Scanner;
import pl.polsl.controler.Controler;
import pl.polsl.model.Diary;
import pl.polsl.view.DiaryView;

/**
 *
 * @author SuperStudent.PL
 */
public class Project {

    public static void main(String[] args) { 
        
        DiaryView view = new DiaryView();
        Diary model = new Diary("Group 5");
//        Subject sub = new Subject("Matematyka");
        Controler controler = new Controler(model,view);
        boolean controlFlag = true;
        Scanner keyboard = new Scanner(System.in);
        
        switch (controler.checkInput(args)) {
            case 1:
                controler.addData(args[0], args[1], args[2], args[3],Float.parseFloat(args[4]));
                System.out.println("Database of " + controler.getClassName());
                view.showDiary(model);
                System.out.println("***************************************************");
                while(controlFlag){
                     System.out.println("Enter the number to make decsion: ");
                     System.out.println("1.Add new record to database");
                     System.out.println("Add a student to an existing subject ");
                     System.out.println("2.Show database");
                     System.out.println("3.Exit ");
                     
                     int number = keyboard.nextInt();
                     if(number == 1){
                         
                         String name;
                         String lastName;
                         String subject;
                         String activity;
                         String grade;

                         System.out.println("Enter the name of student: ");
                         name = keyboard.next();
                         
                         System.out.println("Enter the last name of student: ");
                         lastName = keyboard.next();
                         
                         System.out.println("Enter the subject: ");
                         subject = keyboard.next();
                         
                         System.out.println("Enter the activity: ");
                         activity = keyboard.next();
                         
                         System.out.println("Enter the grade: ");
                         grade = keyboard.next();
                         
                         if(controler.checkInput(name, lastName, subject, activity, grade) == true){
                             controler.addData(name, lastName, subject, activity, Float.parseFloat(grade));
                             System.out.println("Record has been added to database");
                         }
                         else{
                             System.out.println("Invalid data. Try again.");
                             System.out.println("");
                         }
                         
                     }
                     else if(number == 2){
                         view.showDiary(model);
                         System.out.println("***************************************************");
                     }
                     else if (number == 3){
                         controlFlag = false;
                     }
                     else{
                         System.out.println("You entered the wrong number. Try again");
                         System.out.println("");
                       
                     }
                     
                }      
                break;
            case 2:    
      
                while(controlFlag){
                System.out.println("");
                System.out.println("Enter the number to make decsion: ");
                System.out.println("1.Add new record to database"); 
                System.out.println("2.Add new student to existing subject"); 
                System.out.println("3.Show database");
                System.out.println("4.Exit ");
                int number = keyboard.nextInt();
                if(number == 1){
                         String name;
                         String lastName;
                         String subject;
                         String activity;
                         String grade;

                         System.out.println("Enter the name of student: ");
                         name = keyboard.next();
                         
                         System.out.println("Enter the last name of student: ");
                         lastName = keyboard.next();
                         
                         System.out.println("Enter the subject: ");
                         subject = keyboard.next();
                         
                         System.out.println("Enter the activity: ");
                         activity = keyboard.next();
                         
                         System.out.println("Enter the grade: ");
                         grade = keyboard.next();
                         
                         if(controler.checkInput(name, lastName, subject, activity, grade) == true){
                             controler.addData(name, lastName, subject, activity, Float.parseFloat(grade));
                             System.out.println("Record has been added to database");
                         }
                         else{
                             System.out.println("Invalid data. Try again.");
                             System.out.println("");
                         }
                }
                else if(number == 3){
                    view.showDiary(model);
                }
                else if(number == 4){
                    controlFlag = false;
                }
                }
                        
                         
                break;
            default:
                System.out.println();          
                break;
        }
        
    }
}
