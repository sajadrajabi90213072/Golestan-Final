package de.michlb.sample.DTO;

import de.michlb.sample.domain.Course;
import de.michlb.sample.domain.Pre;
import de.michlb.sample.domain.Takelesson;

import java.util.List;

/**
 * Created by Sam on 5/10/2017.
 */
public class CourseDTO {

    private Integer courseID;
    private String courseName;
    private String courseScore;
    private String courseType;
    private String courseGroup;
    private List<Pre> preList;
    private List<Pre> preList1;
    private List<Takelesson> takelessonList;


    public CourseDTO() {
    }


    public void Transform ( Course C )
    {
        this.courseID = C.getCourseID() ;
        this.courseName = C.getCourseName() ;
        this.courseScore = C.getCourseScore() ;
        this.courseType = C.getCourseType() ;
        this.courseGroup = C.getCourseGroup() ;


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

    public List<Pre> getPreList() {
        return preList;
    }

    public void setPreList(List<Pre> preList) {
        this.preList = preList;
    }

    public List<Pre> getPreList1() {
        return preList1;
    }

    public void setPreList1(List<Pre> preList1) {
        this.preList1 = preList1;
    }

    public List<Takelesson> getTakelessonList() {
        return takelessonList;
    }

    public void setTakelessonList(List<Takelesson> takelessonList) {
        this.takelessonList = takelessonList;
    }
}
