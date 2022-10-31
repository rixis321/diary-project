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
 * @author zento
 */
public class RegisterTest {
    
     private Register register;

    
     

         @BeforeEach
       public void setUp(){
        register = new Register("grupa 1"); 
        register.addData("Marek", "Kowalski", "Matematyka", "kartk", (float)5.0);



       }

        @ParameterizedTest
        @CsvSource({"Marek,Kowalski,Matematyka,kartk,2.5", "Kowal, m1,Przyroda,odp,5.0"})
        public void shouldReturnTheSameSizeOfTheRegisterArray(String name, String lname, String sbj, String act, float grade){
             Register register2 = new Register("grupa 1");
             register2.addData(name, lname, sbj, act, grade);
             assertEquals(register.getSize(), register2.getSize());

       }

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
