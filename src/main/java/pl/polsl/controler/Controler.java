/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.controler;
//V-pokazywaniedanych
//M - zaobliczeania
/**
 *
 * @author SuperStudent.PL
 */
public class Controler {
    
    public static void checkInput(String args[]){
        boolean error = false;
        int ocena= 0;
        String imie = "";
        String nazwisko = "";
        

        try{
            ocena = Integer.parseInt(args[0]);
            imie = args[1];
            nazwisko = args[2];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            error = true;
            System.err.println("No arguments !!!");
        } 
    }
}
