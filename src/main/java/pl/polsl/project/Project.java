/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pl.polsl.project;

import java.util.Scanner;
import pl.polsl.controler.Controler;
import pl.polsl.model.Register;
import pl.polsl.view.RegisterView;

/**
 * Main class of the application responsible for the interface.
 * @author Konrad Sygut
 * @version 1.1
 */


public class Project {

    
     /**
     * Main method of the application.
     *
     * @param args first arg - name of the student(string),
     * second arg - lastname of the student(string),
     * third arg - name of the subject(string),
     * fourth arg - name of the activity(string)(e.x egz,kartk,test,odp),
     * fifth arg - grade of the student(int number)(only this numbers user can pass 2,3,4,5)
     * example with passing arguments: Marek Kowalski Informatics kartk 3
     * example with passing arguments: Piotrek Kot Maths egz 4
     * 
     */
    public static void main(String[] args) { 
        
        RegisterView view = new RegisterView(); //creating view
        Register model = new Register("Group 5"); // creating model
        Controler controler = new Controler(model,view); // creating controller
        boolean controlFlag = true;
        Scanner keyboard = new Scanner(System.in);
        String name,lastName,subject,activity,grade;
        
            

        if(controler.checkInputOfData(args) == 1){
            
            System.out.println("Parameters are correct");
            controler.addData(args[0], args[1], args[2], args[3],Float.parseFloat(args[4]));
        }
        
        if(controler.checkInputOfData(args) == 1 ||  controler.checkInputOfData(args) == 2){
            
                System.out.println("Database of " + controler.getClassName());
                while(controlFlag){
                   controler.updateShowInterface();
                     int number = keyboard.nextInt();
                     if(number == 1){// new record adding
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
                      if(!controler.isSubjectsEmpty()){// if ArrayList is not empty
                         System.out.println("Existing subjects");
                        controler.updateSubjectView(model);
                        controlFlag = false;
                        
                        String input;
                        System.out.println("Enter the number of subject to add a student:");
                        System.out.println("");
                         input = keyboard.next();
                         number = Integer.parseInt(input);
                         
                        
                       while(number > controler.getSizeOfSubjects() || number < 0 ){ // if index is out of array
                           System.out.println("You typed a wrong number. Try again.");
                           number = keyboard.nextInt();
                       }
                       
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
                         controler.updateRegisterView(model);
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
        }
        
    }

}