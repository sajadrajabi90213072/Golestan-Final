package de.michlb.sample.service;

import de.michlb.sample.domain.Prof;
import de.michlb.sample.domain.Student;
import de.michlb.sample.domain.Takelesson;

/**
 * Created by Sam on 5/9/2017.
 */
public interface TakeLessonService {

    public Takelesson FindOne (Integer id ) ;
    public Takelesson Save (Takelesson C) ;
    public Iterable<Takelesson> FindAll () ;
    public Iterable<Takelesson> FindStudentCourse ( Student C ) ;
    public Iterable<Takelesson> FindStudentCourse ( Student C , String year , String term  ) ;
    public Iterable<Takelesson> FindProfCourseStudents ( Prof T  ) ;
    public void Delete ( Takelesson C ) ;
    public void Delete (  Integer id  ) ;
    public Takelesson Update ( Takelesson c1 , Takelesson c2 ) ;



}
