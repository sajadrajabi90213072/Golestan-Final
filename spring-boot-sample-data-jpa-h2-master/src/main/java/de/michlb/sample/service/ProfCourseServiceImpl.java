package de.michlb.sample.service;

import de.michlb.sample.domain.Profcourse;
import de.michlb.sample.repositories.ProfCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Sam on 5/13/2017.
 */

@Transactional
@Service
public class ProfCourseServiceImpl implements ProfCourseService {



    @Autowired
    private ProfCourseRepository PCR ;

    @Override
    public Profcourse FindOne(Integer id) {
        return PCR.findOne( id );
    }

    @Override
    public Profcourse Save(Profcourse C) {
        return PCR.save( C );
    }

    @Override
    public Iterable<Profcourse> FindAll() {
        return PCR.findAll();
    }

    @Override
    public void Delete(Profcourse C) {
        PCR.delete( C );
    }

    @Override
    public void Delete(Integer id) {
        PCR.delete( id );
    }

    @Override
    public Profcourse Update(Profcourse c1, Profcourse c2) {
        return null;
    }
}
