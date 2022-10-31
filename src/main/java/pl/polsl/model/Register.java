/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


        
        
package pl.polsl.model;
import java.util.ArrayList;


/**
* 
* Class for Register representation. Its storying subjects in a ArrayList.
* 
* 
* @author  Konrad Sygut
* @version 1.0
*/
public class Register {
    
    //fields
    
    /**
     * Represent class name for a register
     */
    private String className;   
    
     /**
     * ArrayList for storaging subject objects
     */
    private ArrayList<Subject> subjects = new ArrayList<>(20);

    
    
    /**
     * class constructor wtih one parameter
     *
     * @param c_name name of a class(I mean school class for example) as String
     */
    public Register(String c_name){
        this.className=c_name;
    }
    
     /**
     * Default class constructor
     */
    public Register(){};
    
    //methods
    
    
    /**
     * Method for setting a class name for an register object
     * @param name name of a class as String
     */
    public void setClassName(String name){
        this.className = name;
    }
    
    /**
     * Method for checking if an subject ArrayList is empty 
     * @return true, if array is empty else false
     */
    public boolean isEmpty(){
       return this.getSubjects().isEmpty();
        
    }
    
    /**
     * Method that returns size of an array
     * @return size of an array in int type
     */
    public int getSize(){
        return this.subjects.size();
    }
    
    /**
     * Method that returns the class name of an register object
     * @return class name of an object as a String
     */
    public String getClassName(){
    return this.className;
    }
    
    /**
     * Method that adds Subject object to an subjects ArrayList
     * @param subject object of a Subject class 
     */
    public void addSubject(Subject subject){
            subjects.add(subject);
    }

    /**
     * Method that returns the ArrayList of Subject objects
     * @return ArrayList of Subject objects
     */
    public ArrayList<Subject> getSubjects(){
        return subjects;
    } 
    
    /**
     * Method that adds student to subject ArrayList based on the index value
     * @param index value that is used to find elements in an subject ArrayList
     * @param name name of the student
     * @param lname name of the student
     * @param act activity of the student
     * @param g grade of the student
     */        
    public void addStudentToSubject(int index,String name, String lname, String act,float g){
        Student student = new Student(name,lname);
        Grade grd = new Grade(g,act);
        student.addGrade(grd);
        student.calcAvg(student.grades);
        
        for(int i = 0; i< subjects.size();i++){
            this.subjects.get(index).addStudent(student);
            break;
        }
        
    }
    
    /**
     * Method that adds data to Register object.
     * @param name name of the student
     * @param lname last name of the student
     * @param sbj name of the subject
     * @param act activity of the student
     * @param g grade of  student 
     */
    public void addData(String name,String lname, String sbj, String act,float g){
        
           Subject subj = new Subject(sbj);
           Student stud = new Student(name,lname);
           Grade grd = new Grade(g,act);
           
           grd.setGrade(g);
           stud.addGrade(grd);
           stud.calcAvg(stud.grades);
           subj.addStudent(stud);
           this.addSubject(subj);
           
           
     
    }
    
    
//       public void checkStringWithOwnException{String word}{
//        
//        
//          try{
//              
//          }
//          catch(StringException se){
//              System.out.println(se.getMessage());
//          }
//
//          
//     }
//       
//       static float stringToFloat(String input) throws StringException{
//           float result = Float.parseFloat(input);
//           
//       }
//           
//       }
           
       
          
  
    
}
   

//    class StringException extends Exception {
//
//    /**
//     * Non-parameter constructor
//     */
//    public StringException() {
//    }
//
//    /**
//     * Exception class constructor
//     *
//     * @param message display message
//     */
//    public StringException(String message) {
//        super(message);
//    }
    

