/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entitiy class responsible for Subject table model
 *
 * @author Konrad Sygut
 * @version 1.0
 */
@Entity
public class Subject implements Serializable {

    /*Column that contains name of the subject*/
    private String nameOfSubject;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
    // @JoinColumn(name = "subject_id")
    private List<Student> students;

    /**
     * Get the value of students
     *
     * @return the value of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Set the value of students
     *
     * @param students new value of students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Get the value of nameOfSubject
     *
     * @return the value of nameOfSubject
     */
    public String getNameOfSubject() {
        return nameOfSubject;
    }

    /**
     * Set the value of nameOfSubject
     *
     * @param nameOfSubject new value of nameOfSubject
     */
    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
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
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.polsl.entities.Subject[ id=" + id + " ]";
    }

}
