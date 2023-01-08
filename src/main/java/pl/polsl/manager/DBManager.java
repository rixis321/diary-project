/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pl.polsl.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import pl.polsl.entities.Student;
import pl.polsl.entities.Subject;
import pl.polsl.model.Register;

/**
 * Class responsible for creating a connection with database, inserting elements
 * to it and also getting data back from it
 *
 * @author Konrad Sygut
 * @version 1.0
 */
public class DBManager {

    /**
     * Interface used to interact with the persistence context
     */
    private EntityManager em;

    /**
     * Interface used to control transactions on resource-local entity managers
     */
    private EntityTransaction transaction;

    /**
     * Method returns entityManager parameter.
     *
     * @return entityManager parameter
     */
    public EntityManager getEntityManager() {
        return em;
    }

    /**
     * Method returns transaction parameter.
     *
     * @return transaction parameter
     */
    public EntityTransaction getTransaction() {
        return transaction;
    }

    /**
     * Default constructor that creates connection with database
     */
    public DBManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_registerWeb_war_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
        transaction = em.getTransaction();
    }

    /**
     * Method that adds data to the database
     *
     * @param name name of the student
     * @param surname last name of the student
     * @param subject name of the subject
     * @param grade grade of student
     * @param actb activity of the student
     *
     */
    public void sendDatatoDatabase(String name, String surname, String subject, float grade, String actb) {

        Student studSQL = new Student();
        Subject subSQL = new Subject();

        subSQL.setNameOfSubject(subject);
        studSQL.setSubject(subSQL);
        studSQL.setName(name);
        studSQL.setSurname(surname);
        studSQL.setGrade(grade);
        studSQL.setAcitivity(actb);
        studSQL.setSubject(subSQL);

        this.persistObject(subSQL);
        this.persistObject(studSQL);

    }

    /**
     * Method add a recird to database (persist an entity instance)
     *
     * @param object instance of object that will be added to database
     *
     */
    public void persistObject(Object object) {
        transaction.begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {

        }

    }

    /**
     * Method that adds student record to existing subject record based on the
     * it name's
     *
     * @param sub name of the subject
     * @param name name of the student
     * @param surname name of the student
     * @param grade grade of the student
     * @param actv activity of the student
     *
     */
    public void addStudentToExistingSubject(String sub, String name, String surname, float grade, String actv) {
        try {
            Query query = em.createQuery("SELECT s FROM Subject s WHERE s.nameOfSubject ='" + sub + "'");
            List<Subject> subjectList = query.getResultList();
            for (Subject subject : subjectList) {
                Student studSQL = new Student();
                studSQL.setSubject(subject);
                studSQL.setName(name);
                studSQL.setSurname(surname);
                studSQL.setGrade(grade);
                studSQL.setAcitivity(actv);
                studSQL.setSubject(subject);
                this.persistObject(studSQL);
                break;
            }
        } catch (PersistenceException e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {

        }

    }

    /**
     * Method checks if a Subject table is empty
     *
     *
     *
     * @return true if table is empty ,otherwise false
     */
    public boolean isSubjectEmpty() {
        Query query = em.createQuery("SELECT s.id FROM Subject s");
        List<Subject> subjectList = query.getResultList();
        return subjectList.isEmpty();

    }

    /**
     * Method returns names of the subjects from Subject table
     *
     *
     *
     * @return String list with names of the subjects
     */
    public List<String> getSubjectsName() {
        Query query = em.createQuery("SELECT s.nameOfSubject FROM Subject s");
        List<String> subjectList = query.getResultList();
        return subjectList;
    }

    /**
     * Method returns register model with data from database
     *
     *
     *
     * @return register object
     */
    public Register getModel() {

        Register reg = new Register();

        Query query = em.createQuery("SELECT s FROM Subject s");
        Query query2 = em.createQuery("SELECT s FROM Student s");
        List<Subject> subjectList = query.getResultList();
        List<Student> studentList = query2.getResultList();

        for (int i = 0; i < subjectList.size(); i++) {

            for (int j = 0; j < studentList.size(); j++) {
                if (subjectList.get(i).getId() == studentList.get(j).getSubject().getId()) {
                    reg.addData(studentList.get(j).getName(), studentList.get(j).getSurname(), subjectList.get(i).getNameOfSubject(), studentList.get(j).getAcitivity(), studentList.get(j).getGrade());
                }
            }
        }
        return reg;
    }

}
