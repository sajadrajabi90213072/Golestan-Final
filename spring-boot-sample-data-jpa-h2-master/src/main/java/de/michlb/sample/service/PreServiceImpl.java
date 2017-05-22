package de.michlb.sample.service;

import de.michlb.sample.domain.Course;
import de.michlb.sample.domain.Pre;
import de.michlb.sample.repositories.PreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Sam on 5/9/2017.
 */

@Service
@Transactional
public class PreServiceImpl implements  PreService  {

    @Autowired
    private PreRepository PR ;

    @Override
    public Pre FindOne(Integer id) {
        return PR.findOne(id );
    }

    @Override
    public Pre Save(Pre C) {
        return PR.save(C );
    }

    @Override
    public Iterable<Pre> FindAll() {
        return PR.findAll() ;
    }

    @Override
    public void Delete(Pre C) {
        PR.delete( C );
    }

    @Override
    public void Delete(Integer id) {
        PR.delete( id );
    }

    @Override
    public Course Update(Pre c1, Pre c2) {
        return null;
    }
}
