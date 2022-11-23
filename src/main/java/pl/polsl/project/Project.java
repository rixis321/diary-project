/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pl.polsl.project;

import pl.polsl.controler.Controler;
import pl.polsl.gui.MainMenuFrame;
import pl.polsl.model.Register;
import pl.polsl.view.RegisterView;

/**
 * Main class of the application responsible for the interface.
 * @author Konrad Sygut
 * @version 1.2
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
        if(controler.checkInputOfData(args) == 1){
            
            System.out.println("Parameters are correct");
            controler.addData(args[0], args[1], args[2], args[3],Float.parseFloat(args[4]));
        }
         
        if(controler.checkInputOfData(args) == 1 ||  controler.checkInputOfData(args) == 2){
            
            
                    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuFrame(model,controler).setVisible(true);
            }
        });
  
        }
        
    }

}