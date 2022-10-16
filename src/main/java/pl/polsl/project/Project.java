/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pl.polsl.project;

import pl.polsl.controler.Controler;
import pl.polsl.model.Diary;
import pl.polsl.model.Grade;
import pl.polsl.model.Student;
import pl.polsl.model.Subject;
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
        controler.checkInput(args);
//        controler.addToDiary(sub);
//        view.showDiary(model);

//         diar.addToDiary(sub);
         
        
        
//        Student student = new Student("Marek","Kowalski");
//        Student student2 = new Student("Korok","Kowalski");
//        Student student3 = new Student("Dolek","Kowalski");
//        Grade o = new Grade(5,"kartk");
//        Grade o3 = new Grade(3,"egz");
//        Grade o2 = new Grade(4,"spr");
        
//       
//        Subject sub2 = new Subject("Psychilkogia");
//        sub.AddStudent(student);
//        sub.AddStudent(student2);
//        sub.AddStudent(student3);
//        student.addGrade(o);
//        student.addGrade(o2);
//        student.addGrade(o3);
//        student.calcAvg(student.grades);
        
        
//        
//       
//        diar.addToDiary(sub2);
//           
        
    }
}
