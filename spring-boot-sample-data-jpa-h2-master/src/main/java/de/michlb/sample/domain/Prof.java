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
@Table(name = "prof")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prof.findAll", query = "SELECT p FROM Prof p"),
    @NamedQuery(name = "Prof.findByProfID", query = "SELECT p FROM Prof p WHERE p.profID = :profID"),
    @NamedQuery(name = "Prof.findByProfName", query = "SELECT p FROM Prof p WHERE p.profName = :profName"),
    @NamedQuery(name = "Prof.findByProfPassword", query = "SELECT p FROM Prof p WHERE p.profPassword = :profPassword"),
    @NamedQuery(name = "Prof.findByProfField", query = "SELECT p FROM Prof p WHERE p.profField = :profField"),
    @NamedQuery(name = "Prof.findByProfDegree", query = "SELECT p FROM Prof p WHERE p.profDegree = :profDegree")})
public class Prof implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProfID")
    private Integer profID;
    @Column(name = "ProfName")
    private String profName;


    @Column(name = "ProfSSN")
    private String profSSN;

    @Column(name = "ProfPhone")
    private String profPhone;

    @Column(name = "ProfAddress")
    private String profAddress;

    @Column(name = "ProfFatherName")
    private String ProfFatherName;


    @Column(name = "ProfPassword")
    private String profPassword;
    @Column(name = "ProfField")
    private String profField;
    @Column(name = "ProfDegree")
    private String profDegree;
    @OneToMany(mappedBy = "profID")
    private List<Takelesson> takelessonList;
    @OneToMany(mappedBy = "profID")
    private List<Profcourse> profcourseList;

    public Prof() {
    }

    public Prof(Integer profID) {
        this.profID = profID;
    }

    public Integer getProfID() {
        return profID;
    }

    public void setProfID(Integer profID) {
        this.profID = profID;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfPassword() {
        return profPassword;
    }

    public void setProfPassword(String profPassword) {
        this.profPassword = profPassword;
    }

    public String getProfField() {
        return profField;
    }

    public void setProfField(String profField) {
        this.profField = profField;
    }

    public String getProfDegree() {
        return profDegree;
    }

    public void setProfDegree(String profDegree) {
        this.profDegree = profDegree;
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


    public String getProfSSN() {
        return profSSN;
    }

    public void setProfSSN(String profSSN) {
        this.profSSN = profSSN;
    }

    public String getProfPhone() {
        return profPhone;
    }

    public void setProfPhone(String profPhone) {
        this.profPhone = profPhone;
    }

    public String getProfAddress() {
        return profAddress;
    }

    public void setProfAddress(String profAddress) {
        this.profAddress = profAddress;
    }

    public String getProfFatherName() {
        return ProfFatherName;
    }

    public void setProfFatherName(String profFatherName) {
        ProfFatherName = profFatherName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profID != null ? profID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prof)) {
            return false;
        }
        Prof other = (Prof) object;
        if ((this.profID == null && other.profID != null) || (this.profID != null && !this.profID.equals(other.profID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "z.Prof[ profID=" + profID + " ]";
    }
    
}
