package de.michlb.sample.service;

import de.michlb.sample.domain.Course;
import de.michlb.sample.domain.Pre;

/**
 * Created by Sam on 5/9/2017.
 */
public interface PreService {

    public Pre FindOne (Integer id ) ;
    public Pre Save (Pre C) ;
    public Iterable<Pre> FindAll () ;
    public void Delete ( Pre C ) ;
    public void Delete (  Integer id  ) ;
    public Course Update ( Pre c1 , Pre c2 ) ;


}
