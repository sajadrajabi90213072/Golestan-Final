package de.michlb.sample.service;

import de.michlb.sample.domain.Person;

import java.util.List;

/**
 * Created by mbart on 28.02.2016.
 */
public interface PersonService {
  List<Person> loadAll();

  public Person FindOne ( long id ) ;
  public Person Save ( Person C) ;
  //public Iterable<Course> FindAll () ;
  public void Delete ( Person C ) ;
  public void Delete (  long id  ) ;
  //public Course Update ( Course c1 , Course c2 ) ;



}
