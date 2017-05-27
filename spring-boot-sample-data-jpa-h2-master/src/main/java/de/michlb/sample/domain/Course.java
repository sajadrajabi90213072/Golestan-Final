/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.michlb.sample.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sam
 */
@Entity
@Table(name = "course")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c"),
    @NamedQuery(name = "Course.findByCourseID", query = "SELECT c FROM Course c WHERE c.courseID = :courseID"),
    @NamedQuery(name = "Course.findByCourseName", query = "SELECT c FROM Course c WHERE c.courseName = :courseName"),
    @NamedQuery(name = "Course.findByCourseScore", query = "SELECT c FROM Course c WHERE c.courseScore = :courseScore"),
    @NamedQuery(name = "Course.findByCourseType", query = "SELECT c FROM Course c WHERE c.courseType = :courseType"),
    @NamedQuery(name = "Course.findByCourseGroup", query = "SELECT c FROM Course c WHERE c.courseGroup = :courseGroup")})
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CourseID")
    private Integer courseID;
    @Column(name = "CourseName")
    private String courseName;
    @Column(name = "CourseScore")
    private String courseScore;
    @Column(name = "CourseType")
    private String courseType;
    @Column(name = "CourseGroup")
    private String courseGroup;

    @Column(name = "CourseTime")
    private String courseTime;

    @OneToMany(mappedBy = "courseID")
    private List<Pre> preList;
    @OneToMany(mappedBy = "preRequireID")
    private List<Pre> preList1;
    @OneToMany(mappedBy = "courseID")
    private List<Takelesson> takelessonList;
    @OneToMany(mappedBy = "courseID")
    private List<Profcourse> profcourseList;

    public Course() {
    }

    public Course(Integer courseID) {
        this.courseID = courseID;
    }

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(String courseScore) {
        this.courseScore = courseScore;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseGroup() {
        return courseGroup;
    }

    public void setCourseGroup(String courseGroup) {
        this.courseGroup = courseGroup;
    }

    @XmlTransient
    public List<Pre> getPreList() {
        return preList;
    }

    public void setPreList(List<Pre> preList) {
        this.preList = preList;
    }

    @XmlTransient
    public List<Pre> getPreList1() {
        return preList1;
    }

    public void setPreList1(List<Pre> preList1) {
        this.preList1 = preList1;
    }

    @XmlTransient
    public List<Takelesson> getTakelessonList() {
        return takelessonList;
    }

    public void setTakelessonList(List<Takelesson> takelessonList) {
        this.takelessonList = takelessonList;
    }

    @XmlTransient
    public List<Profcourse> getProfcourseList() {
        return profcourseList;
    }

    public void setProfcourseList(List<Profcourse> profcourseList) {
        this.profcourseList = profcourseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseID != null ? courseID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.courseID == null && other.courseID != null) || (this.courseID != null && !this.courseID.equals(other.courseID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "z.Course[ courseID=" + courseID + " ]";
    }
    
}
