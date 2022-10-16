/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.controler;


import pl.polsl.model.Diary;
import pl.polsl.model.Subject;
import pl.polsl.view.DiaryView;

/**
* 
* Controller class in MVC pattern. It controls data flow into Diary object.
* It keeps view and diary model separate.
* @author  Konrad Sygut
* @version 1.0
*/
public class Controler {
    //fields
    
    /**
     * Represent diary model
     */
    private Diary model;
    
    /**
     * Represent diary view
     */
    private DiaryView view;
    
    
    //methods
    
    /**
     * class constructor with 2 parameters.
     * @param d Diary object
     * @param dw DiaryView object
     */
    public Controler(Diary d, DiaryView dw){
        this.model = d;
        this.view = dw;
        
    }
    
    /**
     * Method that update Subject ArrayList, adding subject to ArrayList
     * @param sub object of a Subject class 
     */
    public void addToDiary(Subject sub){
    this.model.addSubject(sub);
    }
    
    
    /**
     * Method that update Subject ArrayList, adding student to it
     * @param indx value that is used to find elements in an subject ArrayList
     * @param name name of the student
     * @param lname name of the student
     * @param act activity of the student
     * @param g grade of the student
     */
    public void addStudentToSubject(int indx, String name, String lname,String act,float g){
       this.model.addStudentToSubject(indx, name, lname, act, g);
        
    }
     /**
     * Method for updating if an subject ArrayList is empty 
     * @return true, if array is empty else false
     */
    public boolean isSubjectsEmpty(){
       return this.model.isEmpty();
        
    }
    
     /**
     * Method that returns size of an array
     * @return size of an array in int type
     */
    public int getSizeOfSubjects(){
        return this.model.getSize();
    }
    
//    public void updateView(){
//        view.showDiary(this.model);
//    }
    
    
    /**
     * Method that returns the class name of an Diary object
     * @return class name of an object as a String
     */
    public String getClassName(){
        return this.model.getClassName();
    }
    
    
     /**
     * Method that updates data, adding data to Diary object.
     * @param name name of the student
     * @param lname last name of the student
     * @param sbj name of the subject
     * @param act activity of the student
     * @param g grade of  student 
     */
    public void addData(String name,String lname, String sbj, String act,float g){
        this.model.addData(name, lname, sbj, act, g);
    }
    
    
    /**
     * Method that checks data input if user is passing arguments from command
     * line
     * @param args first arg - name of the student(string),
     * second arg - lastname of the student(string),
     * third arg - name of the subject(string),
     * fourth arg - name of the activity(string)(e.x egz,kartk,test,odp),
     * fifth arg - grade of the student(int number)
     */
    public int checkInputOfData(String args[]){
        
        int numberOfParameters = args.length;
        int flag = 1;
      
        if(numberOfParameters == 5){
            if(args[0].matches("[a-zA-Z]+" ) && args[1].matches("[a-zA-Z]+") 
                    && args[2].matches("[a-zA-Z]+")
                    && args[3].matches("^[a-zA-Z0-9]+$")){
                
                if(args[4].matches("[2-5]")){
                    
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
    /**
     * Method that checks data input if user is using main program. It refers to
     * checking input if user is adding a record in database
     * @param name name of the student
     * @param lname lastname of the student
     * @param sbj name of the subject
     * @param act name of the activity
     * @param g grade of the student in string type
     * @return true if input is correct, else false
     */
    public boolean checkInputOfData(String name,String lname, String sbj, String act,String g){
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
     /**
     * Method that checks data input if user is using main program. It refers to
     * checking input if user wants to add a student to existing subject
     * @param name name of the student
     * @param lname lastname of the student
     * @param act name of the activity
     * @param g grade of the student in string type
     * @return true if input is correct, else false
     */
    public boolean checkInputOfStudent(String name, String lname,String act,String g){
           if(name.matches("[a-zA-Z]+" ) && lname.matches("[a-zA-Z]+")
                                            && act.matches("^[a-zA-Z0-9]+$")
                                            && g.matches("[2-5]")){
               return true;
           }
           else 
               return false;
        }
    
}
