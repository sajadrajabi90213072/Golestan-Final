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
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentID", query = "SELECT s FROM Student s WHERE s.studentID = :studentID"),
    @NamedQuery(name = "Student.findByStudentName", query = "SELECT s FROM Student s WHERE s.studentName = :studentName"),
    @NamedQuery(name = "Student.findByStudentPassword", query = "SELECT s FROM Student s WHERE s.studentPassword = :studentPassword"),
    @NamedQuery(name = "Student.findByStudentFatherName", query = "SELECT s FROM Student s WHERE s.studentFatherName = :studentFatherName"),
    @NamedQuery(name = "Student.findByStudnetNationalCode", query = "SELECT s FROM Student s WHERE s.studnetNationalCode = :studnetNationalCode"),
    @NamedQuery(name = "Student.findByStudentPhoneNumber", query = "SELECT s FROM Student s WHERE s.studentPhoneNumber = :studentPhoneNumber"),
    @NamedQuery(name = "Student.findByStudentAddress", query = "SELECT s FROM Student s WHERE s.studentAddress = :studentAddress")})
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "StudentID")
    private Integer studentID;
    @Column(name = "StudentName")
    private String studentName;
    @Column(name = "StudentPassword")
    private String studentPassword;
    @Column(name = "StudentFatherName")
    private String studentFatherName;
    @Column(name = "StudnetNationalCode")
    private String studnetNationalCode;
    @Column(name = "StudentPhoneNumber")
    private String studentPhoneNumber;
    @Column(name = "StudentAddress")
    private String studentAddress;
    @OneToMany(mappedBy = "studentID")
    private List<Takelesson> takelessonList;

    public Student() {
    }

    public Student(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentFatherName() {
        return studentFatherName;
    }

    public void setStudentFatherName(String studentFatherName) {
        this.studentFatherName = studentFatherName;
    }

    public String getStudnetNationalCode() {
        return studnetNationalCode;
    }

    public void setStudnetNationalCode(String studnetNationalCode) {
        this.studnetNationalCode = studnetNationalCode;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @XmlTransient
    public List<Takelesson> getTakelessonList() {
        return takelessonList;
    }

    public void setTakelessonList(List<Takelesson> takelessonList) {
        this.takelessonList = takelessonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentID != null ? studentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentID == null && other.studentID != null) || (this.studentID != null && !this.studentID.equals(other.studentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "z.Student[ studentID=" + studentID + " ]";
    }
    
}
