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
@Table(name = "profcourse")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Profcourse.findAll", query = "SELECT p FROM Profcourse p"),
        @NamedQuery(name = "Profcourse.findById", query = "SELECT p FROM Profcourse p WHERE p.id = :id")})
public class Profcourse implements Serializable {
    @Column(name = "Term")
    private String term;
    @Column(name = "Year")
    private String year;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "ProfID", referencedColumnName = "ProfID")
    @ManyToOne
    private Prof profID;
    @JoinColumn(name = "CourseID", referencedColumnName = "CourseID")
    @ManyToOne
    private Course courseID;

    public Profcourse() {
    }

    public Profcourse(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Prof getProfID() {
        return profID;
    }

    public void setProfID(Prof profID) {
        this.profID = profID;
    }

    public Course getCourseID() {
        return courseID;
    }

    public void setCourseID(Course courseID) {
        this.courseID = courseID;
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
        if (!(object instanceof Profcourse)) {
            return false;
        }
        Profcourse other = (Profcourse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "z.Profcourse[ id=" + id + " ]";
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
