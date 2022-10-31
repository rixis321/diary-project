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
 * @author zento
 */
public class StudentTest {
    
        private Student student;



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

