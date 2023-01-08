/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entitiy class responsible for Student table model
 *
 * @author Konrad Sygut
 * @version 1.0
 */
@Entity
public class Student implements Serializable {

    /*Column that contains name of the student*/
    private String name;

    /*Column that contains surname of the student*/
    private String surname;

    /*Column that contains grade of the student*/
    private float grade;

    /*Column that contains activity of the student*/
    private String acitivity;

    /**
     * Get the value of acitivity
     *
     * @return the value of acitivity
     */
    public String getAcitivity() {
        return acitivity;
    }

    /**
     * Set the value of acitivity
     *
     * @param acitivity new value of acitivity
     */
    public void setAcitivity(String acitivity) {
        this.acitivity = acitivity;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    /**
     * Get the value of subject
     *
     * @return the value of subject
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * Set the value of subject
     *
     * @param subject new value of subject
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * Get the value of grade
     *
     * @return the value of grade
     */
    public float getGrade() {
        return grade;
    }

    /**
     * Set the value of grade
     *
     * @param grade new value of grade
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }

    /**
     * Get the value of surname
     *
     * @return the value of surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the value of surname
     *
     * @param surname new value of surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.polsl.entities.Student[ id=" + id + " ]";
    }

}
