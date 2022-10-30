/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pl.polsl.model.Diary;
import pl.polsl.model.Grade;
import pl.polsl.model.Student;
import pl.polsl.model.Subject;

/**
 *
 * @author zento
 */
public class DiaryTest {
    
     private Diary diary;
    
    public DiaryTest() {
    }
    
     @BeforeEach
   public void setUp(){
    diary = new Diary("grupa 1"); 
   }
    
    @Test
    public void testaddData(){
       
//       try{
////           Subject subj = new Subject();
////           Student stud = new Student();
////           Grade grd = new Grade();
//       }
//       catch
//               {
//           
//       }
   }
    
    @Test
    public void testaddStudentToSubject(){
        
        
    }
    
    @Test
    public void testaddSubject(){
            
      
        
        
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
