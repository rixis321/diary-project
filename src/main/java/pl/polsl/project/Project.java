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
 * Main class of the application responsible for the interface.
 * @author Konrad Sygut
 * @version 1.0
 */
public class Project {

    
     /**
     * Main method of the application.
     *
     * @param args first arg - name of the student(string),
     * second arg - lastname of the student(string),
     * third arg - name of the subject(string),
     * fourth arg - name of the activity(string)(e.x egz,kartk,test,odp),
     * fifth arg - grade of the student(int number)
     */
    public static void main(String[] args) { 
        
        DiaryView view = new DiaryView(); //creating view
        Diary model = new Diary("Group 5"); // creating model
//        Subject sub = new Subject("Matematyka");
        Controler controler = new Controler(model,view); // creating controller
        boolean controlFlag = true;
        Scanner keyboard = new Scanner(System.in);
        
        switch (controler.checkInputOfData(args)) {
            case 1: // loading with params
                controler.addData(args[0], args[1], args[2], args[3],Float.parseFloat(args[4]));
                System.out.println("Database of " + controler.getClassName());
                view.showDiary(model);
                System.out.println("***************************************************");
                while(controlFlag){
                     System.out.println("Enter the number to make decsion: ");
                     System.out.println("1.Add new record to database");
                     System.out.println("2.Add a student to an existing subject ");
                     System.out.println("3.Show database");
                     System.out.println("4.Exit ");
                     
                     int number = keyboard.nextInt();
                     if(number == 1){// new record adding
                         
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
                         
                         if(controler.checkInputOfData(name, lastName, subject, activity, grade) == true){
                             controler.addData(name, lastName, subject, activity, Float.parseFloat(grade));
                             System.out.println("Record has been added to database");
                         }
                         else{
                             System.out.println("Invalid data. Try again.");
                             System.out.println("");
                         }
                         
                     }
                     else if(number == 2){// new student to subject adding
                      if(!controler.isSubjectsEmpty()){// if array is not empty
                         System.out.println("Existing subjects");
                        view.showSubjects(model);
                        controlFlag = false;
                        System.out.println("Enter the number of subject to add a student:");
                        System.out.println("");
                        number = keyboard.nextInt();
                       while(number > controler.getSizeOfSubjects() || number < 0 ){ // if index is out of array
                           System.out.println("You typed a wrong number. Try again.");
                           number = keyboard.nextInt();
                       }
                       
                         String name;
                         String lastName;
                         String activity;
                         String grade;
                        System.out.println("Enter the name");
                        name = keyboard.next();
                       System.out.println("Enter the last name");
                       lastName = keyboard.next();
                       System.out.println("Enter the activity: ");
                       activity = keyboard.next();
                        System.out.println("Enter the grade: ");
                        grade = keyboard.next();
                        while(controler.checkInputOfStudent(name, lastName, activity, grade)== false){// checking input
                            System.out.println("Try again.");
                             name = keyboard.next();
                             lastName = keyboard.next();
                             activity = keyboard.next();
                             grade = keyboard.next();
                        }
                        
                        controler.addStudentToSubject(number-1, name, lastName, activity, Float.parseFloat(grade));//adding student
                        System.out.println("Student has been added");
                        controlFlag = true;
                        
                        
                        
                    }
                    else{
                        System.out.println("There are no subjects");
                    }
                     }
                     else if(number == 3){//showing data
                         view.showDiary(model);
                         System.out.println("***************************************************");
                     }
                     else if (number == 4){// exiting program
                         controlFlag = false;
                     }
                     else{// number out of range
                         System.out.println("You entered the wrong number. Try again");
                         System.out.println("");
                       
                     }
                     
                }      
                break;
            case 2:    // loading without params
      
                while(controlFlag){
                    //TESTY 
//                    controler.addData("Marek", "Kowalczyk", "Matematyka", "egz",3);
//                    controler.addData("Konrad", "GIgachad", "Informatyka", "egz",5);
                System.out.println("");
                System.out.println("Enter the number to make decsion: ");
                System.out.println("1.Add new record to database"); 
                System.out.println("2.Add new student to existing subject"); 
                System.out.println("3.Show database");
                System.out.println("4.Exit ");
                int number = keyboard.nextInt();
                if(number == 1){// adding new record
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
                         
                         if(controler.checkInputOfData(name, lastName, subject, activity, grade) == true){
                             controler.addData(name, lastName, subject, activity, Float.parseFloat(grade));
                             System.out.println("Record has been added to database");
                         }
                         else{
                             System.out.println("Invalid data. Try again.");
                             System.out.println("");
                         }
                }
                else if(number == 2){// adding new student to subject
                  
                   
                    
                    if(!controler.isSubjectsEmpty()){
                         System.out.println("Existing subjects");
                        view.showSubjects(model);
                        controlFlag = false;
                        System.out.println("Enter the number of subject to add a student:");
                        System.out.println("");
                        number = keyboard.nextInt();
                       while(number > controler.getSizeOfSubjects() || number < 0 ){
                           System.out.println("You typed a wrong number. Try again.");
                           number = keyboard.nextInt();
                       }
                       
                         String name;
                         String lastName;
                         String activity;
                         String grade;
                        System.out.println("Enter the name");
                        name = keyboard.next();
                       System.out.println("Enter the last name");
                       lastName = keyboard.next();
                       System.out.println("Enter the activity: ");
                       activity = keyboard.next();
                        System.out.println("Enter the grade: ");
                        grade = keyboard.next();
                        while(controler.checkInputOfStudent(name, lastName, activity, grade)== false){
                            System.out.println("Try again.");
                             name = keyboard.next();
                             lastName = keyboard.next();
                             activity = keyboard.next();
                             grade = keyboard.next();
                        }
                        
                        controler.addStudentToSubject(number-1, name, lastName, activity, Float.parseFloat(grade));
                        System.out.println("Student has been added");
                        controlFlag = true;
                        
                        
                        
                    }
                    else{// database without subjects
                        System.out.println("There are no subjects");
                    }
                                  
                }
                else if(number == 3){//showing model
                    view.showDiary(model);
                }
                else if(number == 4){// out of range
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
