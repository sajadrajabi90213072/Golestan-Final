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
@Table(name = "pre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pre.findAll", query = "SELECT p FROM Pre p"),
    @NamedQuery(name = "Pre.findById", query = "SELECT p FROM Pre p WHERE p.id = :id")})
public class Pre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "CourseID", referencedColumnName = "CourseID")
    @ManyToOne
    private Course courseID;
    @JoinColumn(name = "PreRequireID", referencedColumnName = "CourseID")
    @ManyToOne
    private Course preRequireID;

    public Pre() {
    }

    public Pre(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Course getCourseID() {
        return courseID;
    }

    public void setCourseID(Course courseID) {
        this.courseID = courseID;
    }

    public Course getPreRequireID() {
        return preRequireID;
    }

    public void setPreRequireID(Course preRequireID) {
        this.preRequireID = preRequireID;
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
        if (!(object instanceof Pre)) {
            return false;
        }
        Pre other = (Pre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "z.Pre[ id=" + id + " ]";
    }
    
}
