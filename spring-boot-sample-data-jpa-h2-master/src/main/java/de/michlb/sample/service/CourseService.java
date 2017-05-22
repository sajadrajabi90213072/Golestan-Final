package de.michlb.sample.service;

import de.michlb.sample.domain.Course;

/**
 * Created by Sam on 5/9/2017.
 */
public interface CourseService {


    public Course FindOne ( Integer id ) ;
    public Course Save ( Course C) ;
    public Iterable<Course> FindAll () ;
    public void Delete ( Course C ) ;
    public void Delete (  Integer id  ) ;
    public Course Update ( Course c1 , Course c2 ) ;


}
