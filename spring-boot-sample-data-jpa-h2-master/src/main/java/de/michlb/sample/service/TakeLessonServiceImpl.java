package de.michlb.sample.service;

import de.michlb.sample.domain.Prof;
import de.michlb.sample.domain.Student;
import de.michlb.sample.domain.Takelesson;
import de.michlb.sample.repositories.TakeLessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Sam on 5/9/2017.
 */

@Service
@Transactional
public class TakeLessonServiceImpl implements TakeLessonService  {


    @Autowired
    private TakeLessonRepository TLR ;


    @Override
    public Takelesson FindOne(Integer id) {
        return TLR.findOne( id );
    }

    @Override
    public Takelesson Save(Takelesson C) {
        return TLR.save(C );
    }

    @Override
    public Iterable<Takelesson> FindAll() {
        return TLR.findAll() ;
    }

    @Override
    public Iterable<Takelesson> FindStudentCourse(Student C) {
        return TLR.findBystudentID( C );
    }

    @Override
    public Iterable<Takelesson> FindStudentCourse(Student C, String year, String term) {
        return TLR.findBystudentIDAndYearAndTerm( C , year , term );
    }

    @Override
    public Iterable<Takelesson> FindProfCourseStudents(Prof T) {
        return TLR.findByprofID(T );
    }

    @Override
    public void Delete(Takelesson C) {
        TLR.delete( C );
    }

    @Override
    public void Delete(Integer id) {
        TLR.delete( id );
    }

    @Override
    public Takelesson Update(Takelesson c1, Takelesson c2) {
        return null;
    }
}
