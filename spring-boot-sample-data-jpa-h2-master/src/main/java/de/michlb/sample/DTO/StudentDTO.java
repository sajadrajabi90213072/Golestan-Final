package de.michlb.sample.DTO;

import de.michlb.sample.domain.Student;
import de.michlb.sample.domain.Takelesson;

import java.util.List;

/**
 * Created by Sam on 5/10/2017.
 */
public class StudentDTO {


    private Integer studentID;
    private String studentName;
    private String studentPassword;
    private String studentFatherName;
    private String studnetNationalCode;
    private String studentPhoneNumber;
    private String studentAddress;
    private List<Takelesson> takelessonList;

    public StudentDTO() {
    }


    public void Transform ( Student S )
    {
        this.studentID = S.getStudentID() ;
        this.studentName = S.getStudentName() ;
        this.studentAddress = S.getStudentAddress() ;
        this.studentPassword = S.getStudentPassword() ;
        this.studentFatherName = S.getStudentFatherName() ;
        this.studentPhoneNumber = S.getStudentPhoneNumber() ;
        this.studnetNationalCode = S.getStudnetNationalCode() ;
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

    public List<Takelesson> getTakelessonList() {
        return takelessonList;
    }

    public void setTakelessonList(List<Takelesson> takelessonList) {
        this.takelessonList = takelessonList;
    }
}
