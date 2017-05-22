package de.michlb.sample.service;

import de.michlb.sample.domain.Prof;
import de.michlb.sample.repositories.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Sam on 5/9/2017.
 */

@Service
@Transactional
public class ProfServiceImpl implements  ProfService {

    @Autowired
    private ProfRepository PR ;

    @Override
    public Prof FindOne(Integer id) {
        return PR.findOne( id );
    }

    @Override
    public Prof Save(Prof C) {
        return PR.save( C );
    }

    @Override
    public Iterable<Prof> FindAll() {
        return PR.findAll() ;
    }

    @Override
    public void Delete(Prof C) {
        PR.delete( C );
    }

    @Override
    public void Delete(Integer id) {
        PR.delete( id );
    }

    @Override
    public Prof Update(Prof c1, Prof c2) {
        return null;
    }
}
