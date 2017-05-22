package de.michlb.sample.service;

import de.michlb.sample.domain.Course;
import de.michlb.sample.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Sam on 5/9/2017.
 */
@Service
@Transactional
public class CourseServiceImpl implements  CourseService  {


    @Autowired
    private CourseRepository CR ;


    @Override
    public Course FindOne(Integer id) {
        return CR.findOne( id );
    }

    @Override
    public Course Save(Course C) {
        return CR.save( C );
    }

    @Override
    public Iterable<Course> FindAll() {
        return CR.findAll() ;
    }

    @Override
    public void Delete(Course C) {
        CR.delete( C );

    }

    @Override
    public void Delete( Integer id ) {
        CR.delete( id );
    }

    @Override
    public Course Update(Course c1, Course c2) {
        return null;
    }
}
