/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.tests;


import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.model.Grade;
import pl.polsl.model.Student;

/**
* 
* Class that contains test for methods of the Student class

* @author  Konrad Sygut
* @version 1.1
*/
public class StudentTest {
    
    
        /**
        * Represents the subject model
        */
        private Student student;


            /**
           * Method that creates student and grades before each test. Its also 
           * calculating the average needed for comparing with test function.
           */
         @BeforeEach
         public void setUp(){
             student = new Student("Mateusz" ,"Kowalski");
             Grade grade = new Grade((float) 5.0, "egz");
             Grade grade2 = new Grade((float) 4.0, "egz");
             Grade grade3 = new Grade((float) 3.0, "egz");
             Grade grade4 = new Grade((float) 2.0, "egz");
             student.addGrade(grade);
             student.addGrade(grade2);
             student.addGrade(grade3);
             student.addGrade(grade4);
             student.calcAvg(student.grades);

         }
         
          /**
                * Method that tests the Student function called
                * calcAvg(ArrayList Grades g)
                * Test checks if the test function returns the same average as
                * the previous one that was created before test. That means 
                * that average was calculated correctly
                * @param name first parameter string(student name)
                * @param lname second parameter string (student last name)
                * @param g grade of the student
                * @param g2 grade of the student
                * @param g3 grade of the student
                * @param g4 grade of the student
                */
         
        @ParameterizedTest
        @CsvSource({"Ola,Kowalska,5,4,3,2","Arek,Kowalski,5,4,3,2"})
        public void shouldReturnTheSameAverage(String name, String lname,float g , float g2,
                                                float g3,float g4){

            Student student2 = new Student(name,lname);
             Grade grade = new Grade((float) g, "egz");
             Grade grade2 = new Grade((float) g2, "egz");
             Grade grade3 = new Grade((float) g3, "egz");
             Grade grade4 = new Grade((float) g4, "egz");

              student2.addGrade(grade);
             student2.addGrade(grade2);
             student2.addGrade(grade3);
             student2.addGrade(grade4);
             student2.calcAvg(student2.grades);

             assertEquals(student.average,student2.average);
        }


                /**
                * Method that tests the Student function called
                * addGrade(Grade grd)
                * Test checks if the grades arrays are of the same size.
                * If they are equal it means that the data was added correctly
                * @param name first parameter string(student name)
                * @param lname second parameter string (student last name)
                * @param g grade of the student
                * @param g2 grade of the student
                * @param g3 grade of the student
                * @param g4 grade of the student
                */
        @ParameterizedTest
        @CsvSource({"Monika,Kowalska,5,4,3,2","Arek,Kowal,5,4,3,2"})
        public void shouldReturnTheSameSizeOfGradesArray(String name, String lname,float g , float g2,
                float g3,float g4){

             Student student2 = new Student(name,lname);
             Grade grade = new Grade((float) g, "egz");
             Grade grade2 = new Grade((float) g2, "egz");
             Grade grade3 = new Grade((float) g3, "egz");
             Grade grade4 = new Grade((float) g4, "egz");

             student2.addGrade(grade);
             student2.addGrade(grade2);
             student2.addGrade(grade3);
             student2.addGrade(grade4);


             assertEquals(student.grades.size(),student2.grades.size());

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

