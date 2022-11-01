/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.model.Student;
import pl.polsl.model.Subject;

/**
* 
* Class that contains test for methods of the Subject class

* @author  Konrad Sygut
* @version 1.1
*/
public class SubjectTest {
   
    
    /**
     * Represents the subject model
     */
     private Subject subject;
     
     
     
           /**
           * Method that creates subject and student before each test. Its also 
           * adding the student to the students array to the subject object.Its
           * used for comparing with test funtion.
           */
     @BeforeEach
     public void setUp(){
         subject = new Subject("Matematyka");
         Student student = new Student("Marek","Kowalski");
         subject.addStudent(student);
     }
     
     
       /**
                * Method that tests the Subject function called
                * addStudent(Student stud)
                * Test checks if the students arrays are of the same size. If
                * they are equal it means that the data was added correctly
                * @param name name of the student
                * @param lname last name of the student
                */
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

