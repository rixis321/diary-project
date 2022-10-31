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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.model.Register;
import pl.polsl.model.Grade;
import pl.polsl.model.Student;
import pl.polsl.model.Subject;

/**
 *
 * @author zento
 */
public class RegisterTest {
    
     private Register register;
     private Subject subject;
    
    public RegisterTest() {
    }
    
     @BeforeEach
   public void setUp(){
    register = new Register("grupa 1"); 
    register.addData("Marek", "Kowalski", "Matematyka", "kartk", 5);
    register.addData("Kowal", "m1", "Przyroda", "akt", (float) 3.5);
 
   }
    
    @ParameterizedTest
    @CsvSource({"Marek,Kowalski,Matematyka,kartk,5",
                "Kowal,m1,Przyroda,akt,3.5"})
    public void shouldReturnTheSameSizeOfTheArray(String name, String lname, String sbj, String act, float grade){
         Register register2 = new Register("grupa 1");
         register2.addData(name, lname, sbj, act, grade);     
         assertEquals(register.getSize(), register2.getSize());
       
   }
    
//    @Test
//    public void testaddStudentToSubject(){
//        
//        
//    }
//    
//    @Test
//    public void testaddSubject(){
//            
//      
//        
//        
//    }
   
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
