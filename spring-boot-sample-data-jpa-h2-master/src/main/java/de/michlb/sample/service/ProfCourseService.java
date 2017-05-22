package de.michlb.sample.service;

import de.michlb.sample.domain.Profcourse;

/**
 * Created by Sam on 5/13/2017.
 */
public interface ProfCourseService {

    public Profcourse FindOne (Integer id ) ;
    public Profcourse Save ( Profcourse C) ;
    public Iterable<Profcourse> FindAll () ;
    public void Delete ( Profcourse C ) ;
    public void Delete (  Integer id  ) ;
    public Profcourse Update ( Profcourse c1 , Profcourse c2 ) ;


}
