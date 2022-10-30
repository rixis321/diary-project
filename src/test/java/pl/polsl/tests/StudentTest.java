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
import pl.polsl.model.Student;

/**
 *
 * @author zento
 */
public class StudentTest {
    
    private Student student;
    
    
     @BeforeEach
     public void setUp(){
         student = new Student("Mateusz" ,"Kowalski");
     }
     
     @Test
     public void testcalcAvg(){
         
     }
     
     @Test
     public void testaddGrade(){
         
     }
     
     
   
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
//    public StudentTest() {
//    }
//    
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

