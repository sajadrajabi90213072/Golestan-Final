package de.michlb.sample.service;

import de.michlb.sample.domain.Prof;

/**
 * Created by Sam on 5/9/2017.
 */
public interface ProfService {

    public Prof FindOne ( Integer id ) ;
    public Prof Save (Prof C) ;
    public Iterable<Prof> FindAll () ;
    public void Delete ( Prof C ) ;
    public void Delete (  Integer id  ) ;
    public Prof Update ( Prof c1 , Prof c2 ) ;

}
