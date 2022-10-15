/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pl.polsl.project;

import pl.polsl.model.Diary;
import pl.polsl.model.Subject;

/**
 *
 * @author SuperStudent.PL
 */
public class Project {

    public static void main(String[] args) { 
        
        Diary diar = new Diary("Informatyka");
        Subject sub = new Subject("Matematyka");
        diar.addToDiary(sub);
        diar.showDiary();
        
    }
}
