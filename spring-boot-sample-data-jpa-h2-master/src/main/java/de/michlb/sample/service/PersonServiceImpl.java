package de.michlb.sample.service;

import de.michlb.sample.domain.Person;
import de.michlb.sample.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mbart on 28.02.2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

  @Autowired
  private PersonRepository personRepository;

  @Override
  public List<Person> loadAll() {
    return personRepository.findAll();
  }

  @Override
  public Person FindOne(long id) {
    return personRepository.findOne( id );
  }

  @Override
  public Person Save(Person C) {
    return personRepository.save( C );
  }

  @Override
  public void Delete(Person C) {
    personRepository.delete( C );
  }

  @Override
  public void Delete(long id) {
    personRepository.delete( id );
  }
}
