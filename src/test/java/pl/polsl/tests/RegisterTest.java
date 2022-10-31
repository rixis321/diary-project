/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.tests;


import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.model.Register;
import pl.polsl.model.Subject;

/**
* 
* Class that contains tests for methods of the Register class

* @author  Konrad Sygut
* @version 1.0
*/
public class RegisterTest {
    
    
    
         /**
         * Represent register model
         */
     private Register register;

    
     
              /**
           * Method that creates register and adds data before each test
           *
           */
         @BeforeEach
       public void setUp(){
        register = new Register("grupa 1"); 
        register.addData("Marek", "Kowalski", "Matematyka", "kartk", (float)5.0);



       }
        
               /**
                * Method that tests the Register function called
                * addData(String name,String lname, String sbj, String act,float g)
                * Test checks if the subject arrays are of the same size. That means 
                * that all data was added correctly.
                * @param name student name as a string
                * @param lname student last name as a string
                * @param sbj subject name as a string
                * @param act name of the activity as a string
                * @param grade grade of the student as a float 
                */
        @ParameterizedTest
        @CsvSource({"Marek,Kowalski,Matematyka,kartk,2.5", "Kowal, m1,Przyroda,odp,5.0"})
        public void shouldReturnTheSameSizeOfTheSubjectArray(String name, String lname, String sbj, String act, float grade){
             Register register2 = new Register("grupa 1");
             register2.addData(name, lname, sbj, act, grade);
             assertEquals(register.getSize(), register2.getSize());

       }
            
        
             /**
                * Method that tests the Register function called
                * addStudentToSubject(int index,String name, String lname, String act,float g)
                * Test checks if the students arrays are of the same size. That means 
                * that all data was added correctly.
                * @param index index of the element in the subject array
                * @param name student name as a string
                * @param lname student last name as a string
                * @param act name of the activity as a string
                * @param grade grade of the student as a float 
                */
        @ParameterizedTest
        @CsvSource({"0,Best,Kapitan,egz,4.0","1,Marek,Dark,odp,3.5"})
        public void shouldReturnTheSameSizeOfTheStudentArray(int index, String name, String lname, String act,float grade){
             Register register2 = new Register("grupa 1");
             Subject sub1 = new Subject("Matematyka");
             Subject sub2 = new Subject("Przyroda");
             register2.addSubject(sub1);
             register2.addSubject(sub2);
             register2.addStudentToSubject(0, name, lname, act, grade);


             assertEquals(register.getSubjects().get(0).getStudents().size(), 
                         register2.getSubjects().get(0).getStudents().size());
        }
        
        
         /**
                * Method that tests the Register function called
                * addSubject(Subject subject)
                * Test checks if the subject arrays are of the same size. That means 
                * that all data was added correctly.
                * @param sub object of the Subject class
                */
        @ParameterizedTest
        @CsvSource({"Informatyka","Analiza","SMiW"})
        public void shouldReturnTheSameSizeOfTheSubjectArray(Subject sub){
                Register register2 = new Register("grupa 1");
                register2.addSubject(sub);

            assertEquals(register.getSubjects().size(), register2.getSubjects().size());

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
