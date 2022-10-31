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
import pl.polsl.model.Student;
import pl.polsl.model.Subject;

/**
 *
 * @author zento
 */
public class SubjectTest {
   
     private Subject subject;
     
     @BeforeEach
     public void setUp(){
         subject = new Subject("Matematyka");
         Student student = new Student("Marek","Kowalski");
         subject.addStudent(student);
     }
     
     @ParameterizedTest
    @CsvSource({"Ola,Kowalska","Marek,Taczka", "Olek,Mlotek"})
     public void shouldReturnTheSameSizeOfStudentArray(String name, String lname){
         
         Subject sub2 = new Subject("Przyroda");
         Student student2 = new Student(name, lname);
         sub2.addStudent(student2);
         
         assertEquals(subject.getStudents().size(), sub2.getStudents().size());
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}    
//    public SubjectTest() {
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

