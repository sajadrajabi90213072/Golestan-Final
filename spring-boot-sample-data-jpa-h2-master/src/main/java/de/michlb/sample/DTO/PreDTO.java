package de.michlb.sample.DTO;

import de.michlb.sample.domain.Course;
import de.michlb.sample.domain.Pre;

/**
 * Created by Sam on 5/11/2017.
 */
public class PreDTO {


    private Integer id;
    private Course preRequireID;
    private Course courseID;

    public PreDTO() {
    }


    public void Transform ( Pre C )
    {

        this.id=  C.getId() ;
        this.preRequireID = C.getPreRequireID() ;
        this.courseID = C.getCourseID() ;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Course getPreRequireID() {
        return preRequireID;
    }

    public void setPreRequireID(Course preRequireID) {
        this.preRequireID = preRequireID;
    }

    public Course getCourseID() {
        return courseID;
    }

    public void setCourseID(Course courseID) {
        this.courseID = courseID;
    }
}
