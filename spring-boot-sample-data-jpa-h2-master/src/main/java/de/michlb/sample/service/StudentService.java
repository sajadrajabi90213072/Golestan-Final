package de.michlb.sample.service;

import de.michlb.sample.domain.Student;

/**
 * Created by Sam on 5/9/2017.
 */
public interface StudentService  {


    public Student FindOne (Integer id ) ;
    public Student Save (Student C) ;
    public Iterable<Student> FindAll () ;
    public void Delete ( Student C ) ;
    public void Delete (  Integer id  ) ;
    public Student Update ( Student c1 , Student c2 ) ;


}
