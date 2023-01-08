/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.view;

import pl.polsl.model.Register;

/**
 * temat: dziennik z ocenami 
 * Do bazy danych sa dodawane przedmioty wraz ze
 * studentem. Po dodaniu go do bazy danych podczas wybrania opcji Show jest on z
 * niej wczytywany. Dodawanie studenta do istniejacego przedmiotu rowniez dodaje
 * go do bazy danych Z ciastek odczytywania jest informacja o ostatnio dodanym
 * studencie
 *
 *
 *
 * View class in MVC pattern. Used for displaying the data.
 *
 * @author Konrad Sygut
 * @version 1.1
 */
public class RegisterView {

    /**
     * Method that display the data of the diary.
     *
     * @param d Diary object
     */
    public void showDiary(Register d) {
        System.out.println(d.getClassName());
        System.out.println("************************");
        //printing subjects
        for (int i = 0; i < d.getSubjects().size(); i++) {

            System.out.println(d.getSubjects().get(i).getSubName());

            //printing students
            for (int j = 0; j < d.getSubjects().get(i).getStudents().size(); j++) {

                System.out.print((j + 1) + "." + d.getSubjects().get(i).getStudents().get(j).getName() + " "
                        + d.getSubjects().get(i).getStudents().get(j).getLastName() + " ");

                //printing grades
                for (int k = 0; k < d.getSubjects().get(i).getStudents().get(j).grades.size(); k++) {

                    //printing activites
                    for (int m = 0; m < d.getSubjects().get(i).getStudents().get(j).grades.get(k).getActivities().size(); m++) {
                        System.out.print(d.getSubjects().get(i).getStudents().get(j).grades.get(k).getActivities().get(m) + ": ");
                    }
                    System.out.print(d.getSubjects().get(i).getStudents().get(j).grades.get(k).getGrade() + " ");

                }
                System.out.print("average: " + d.getSubjects().get(i).getStudents().get(j).average + " ");
                System.out.print("\n");
            }

        }
    }

    /**
     * Method that display the subjects
     *
     * @param d Diary object
     */
    public void showSubjects(Register d) {

        for (int i = 0; i < d.getSubjects().size(); i++) {
            System.out.println((i + 1) + "." + d.getSubjects().get(i).getSubName());
        }

    }

    /**
     * Method that display the interface
     *
     */
    public void showInterface() {
        System.out.println("******************************************************");
        System.out.println("Enter the number to make decsion: ");
        System.out.println("1.Add new record to database");
        System.out.println("2.Add a student to an existing subject ");
        System.out.println("3.Show database");
        System.out.println("4.Exit ");

    }

}
