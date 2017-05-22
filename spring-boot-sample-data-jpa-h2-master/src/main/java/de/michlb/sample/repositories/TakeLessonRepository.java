package de.michlb.sample.repositories;

import de.michlb.sample.domain.Prof;
import de.michlb.sample.domain.Student;
import de.michlb.sample.domain.Takelesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sam on 5/9/2017.
 */


@Repository
public interface TakeLessonRepository extends JpaRepository< Takelesson, Integer > {


    public Iterable<Takelesson> findBystudentID(   Student T ) ;
    public Iterable<Takelesson> findBystudentIDAndYearAndTerm(   Student T , String year , String term  ) ;
    public Iterable<Takelesson> findByprofID(   Prof T ) ;


}
