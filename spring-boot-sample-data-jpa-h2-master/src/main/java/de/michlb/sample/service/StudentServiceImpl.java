package de.michlb.sample.service;

import de.michlb.sample.domain.Student;
import de.michlb.sample.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Sam on 5/9/2017.
 */

@Service
@Transactional
public class StudentServiceImpl implements  StudentService  {

    @Autowired
    private StudentRepository SR ;


    @Override
    public Student FindOne(Integer id) {
        return SR.findOne( id );
    }

    @Override
    public Student Save(Student C) {
        return SR.save( C );
    }

    @Override
    public Iterable<Student> FindAll() {
        return SR.findAll() ;
    }

    @Override
    public void Delete(Student C) {
        SR.delete( C );
    }

    @Override
    public void Delete(Integer id) {
        SR.delete( id );
    }

    @Override
    public Student Update(Student c1, Student c2) {
        return null;
    }
}
