/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.michlb.sample.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sam
 */
@Entity
@Table(name = "takelesson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Takelesson.findAll", query = "SELECT t FROM Takelesson t"),
    @NamedQuery(name = "Takelesson.findById", query = "SELECT t FROM Takelesson t WHERE t.id = :id"),
    @NamedQuery(name = "Takelesson.findByScore", query = "SELECT t FROM Takelesson t WHERE t.score = :score"),
    @NamedQuery(name = "Takelesson.findByYear", query = "SELECT t FROM Takelesson t WHERE t.year = :year"),
    @NamedQuery(name = "Takelesson.findByTerm", query = "SELECT t FROM Takelesson t WHERE t.term = :term")})
public class Takelesson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Score")
    private String score;
    @Column(name = "Year")
    private String year;
    @Column(name = "Term")
    private String term;
    @JoinColumn(name = "CourseID", referencedColumnName = "CourseID")
    @ManyToOne
    private Course courseID;
    @JoinColumn(name = "ProfID", referencedColumnName = "ProfID")
    @ManyToOne
    private Prof profID;
    @JoinColumn(name = "StudentID", referencedColumnName = "StudentID")
    @ManyToOne
    private Student studentID;

    public Takelesson() {
    }

    public Takelesson(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Course getCourseID() {
        return courseID;
    }

    public void setCourseID(Course courseID) {
        this.courseID = courseID;
    }

    public Prof getProfID() {
        return profID;
    }

    public void setProfID(Prof profID) {
        this.profID = profID;
    }

    public Student getStudentID() {
        return studentID;
    }

    public void setStudentID(Student studentID) {
        this.studentID = studentID;
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
        if (!(object instanceof Takelesson)) {
            return false;
        }
        Takelesson other = (Takelesson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "z.Takelesson[ id=" + id + " ]";
    }
    
}
