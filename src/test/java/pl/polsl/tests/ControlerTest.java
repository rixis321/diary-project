/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.tests;


import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.controler.Controler;
import pl.polsl.model.Register;
import pl.polsl.view.RegisterView;

/**
* 
* Class that contains tests for methods of the Controller class

* @author  Konrad Sygut
* @version 1.1
*/
public class ControlerTest {
    
    //fields
    
        /**
         * Represent controler
         */
        private Controler controler;
        
        /**
         * Represent register model
         */
        private Register model;
        
        /**
        * Represent register view
        */
        private RegisterView view;
    
        //methods
        
 
          /**
           * Method that creates controler before each test
           *
           */
        @BeforeEach
        public void setUp() {

            controler = new Controler(model,view);

        }

        /**
     * Method that tests the Controler function called  checkInputOfData(String args[])
     * Test checks if a testing funcion returns one, because flag = 1 is a state where
     * parameters are correct. 
     * @param param0 first parameter string(student name)
     * @param param1 second parameter string (student last name)
     * @param param2 third parameter string (subject name)
     * @param param3 fourth parameter string(name of the activity)
     * @param param4 fifth parameter string(grade)
     */
        @ParameterizedTest
        @CsvSource({"Marek,Kowalski,Matematyka,kartk,2.5","Konrad,Kowal,Analiza,odp,5.0"})
        public void shouldReturnFlagEqualsOneWhereInputFromArgsIsCorrect(String param0,String param1,
                                                        String param2,String param3, String param4){

               String[] params = {param0,param1,param2,param3,param4};



               assertEquals(1, controler.checkInputOfData(params));

        }
        
      /**
     * Method that tests the Controler function called  checkInputOfData(String args[])
     * Test checks if a testing funcion returns two, because flag = 2 is a state where
     * there are no parameters or not enough of them
     * @param param0 first parameter string(student name)
     * @param param1 second parameter string (student last name)
     * @param param2 third parameter string (subject name)
     * @param param3 fourth parameter string(name of the activity)
     * @param param4 fifth parameter string(grade)
     */
        @ParameterizedTest
        @CsvSource({"Marek,Kowalski,Matematyka,kartk,2.5,20","Konrad,Kowal,Analiza,odp,5.0,20","4,200,1,50,2.5,50"})
        public void shouldReturnFlagEqualsTwoWhereInputFromArgsIsNotCorrect(String param0,String param1, 
                                                String param2,String param3, String param4,String param5){

               String[] params = {param0,param1,param2,param3,param4,param5};

               assertEquals(2, controler.checkInputOfData(params));

        }      


      /**
     * Method that tests the Controler function called  checkInputOfData(String args[])
     * Test checks if a testing funcion returns zero, because flag = 0 is a state where
     * parameters are not correct. Test refers to check data from user if he wants to
     * pass the arguemnts from command line
     * @param param0 first parameter string(student name)
     * @param param1 second parameter string (student last name)
     * @param param2 third parameter string (subject name)
     * @param param3 fourth parameter string(name of the activity)
     * @param param4 fifth parameter string(grade)
     */
        @ParameterizedTest
        @CsvSource({"Marek,200,Matematyka,kartk,2.5,","Konrad,200,Analiza,odp,5.0,20"})
        public void shouldReturnFlagEqualsZeroWhereInputFromArgsIsNotCorrect(String param0,String param1, 
                                                String param2,String param3, String param4){

               String[] params = {param0,param1,param2,param3,param4};

               assertEquals(0, controler.checkInputOfData(params));

        }    

         /**
     * Method that tests the Controler function called  
     * checkInputOfData(String name,String lname, String sbj, String act,String g)
     * Test checks if a testing funcion returns true, when the parameters are correct
     * @param name student name as a string
     * @param lname student last name as a string
     * @param sub subject name as a string
     * @param act name of the activity as a string
     * @param grade grade of the student as a float 
     */
        @ParameterizedTest
        @CsvSource({"Marek,Kowalski,Matematyka,kartk,3.0","Konrad,Kowal,Analiza,odp,4.0"})
        public void shouldReturnTrueWhereInputIsCorrect(String name, String lname, String sub, String act, String grade){



            assertTrue(controler.checkInputOfData(name, lname, sub, act, grade));
        }   
        
        
        
             /**
               * Method that tests the Controler function called  
               * checkInputOfData(String name,String lname, String sbj, String act,String g)
               * Test checks if a testing funcion returns false, when the parameters are not correct
               * @param name student name as a string
               * @param lname student last name as a string
               * @param sub subject name as a string
               * @param act name of the activity as a string
               * @param grade grade of the student as a float 
               */
        @ParameterizedTest
        @CsvSource({"Marek,500,Matematyka,kartk,3.0","1,2,125,odp,4.0"})
        public void shouldReturnFalseWhereInputIsNotCorrect(String name, String lname, String sub, String act, String grade){



            assertFalse(controler.checkInputOfData(name, lname, sub, act, grade));
        } 

             /**
            * Method that tests the Controler function called  
            * checkInputOfStudent(String name, String lname,String act,String g)
            * Test checks if a testing funcion returns true, when the parameters are correct
            * @param name student name as a string
            * @param lname student last name as a string
            * @param act name of the activity as a string
            * @param grade grade of the student as a float
            */
        @ParameterizedTest
        @CsvSource({"Darek,Kowalski,kartk,3.0","Handlarka,Roznosci,odp,5.0"})
        public void shouldReturnTrueWhereInputOfStudentIsCorrect(String name, String lname,String act, String grade){



            assertTrue(controler.checkInputOfStudent(name, lname, act, grade));
        } 

          
        
         /**
            * Method that tests the Controler function called  
            * checkInputOfStudent(String name, String lname,String act,String g)
            * Test checks if a testing funcion returns false, when the parameters are not correct
            * @param name student name as a string
            * @param lname student last name as a string
            * @param act name of the activity as a string
            * @param grade grade of the student as a float
            */
         @ParameterizedTest
        @CsvSource({"300,Kowalski,12345567,3.0","500,Roznosci,odp,5.0"})
        public void shouldReturnFalseWhereInputOfStudentIsNotCorrect(String name, String lname,String act, String grade){



            assertFalse(controler.checkInputOfStudent(name, lname, act, grade));
        } 
        
        
    //    @AfterEach
    //    public void tearDown() {
    //    }

        // TODO add test methods here.
        // The methods must be annotated with annotation @Test. For example:
        //
        // @Test
        // public void hello() {}
    }
