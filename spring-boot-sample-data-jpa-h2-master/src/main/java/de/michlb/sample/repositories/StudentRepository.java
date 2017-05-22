package de.michlb.sample.repositories;

import de.michlb.sample.domain.Prof;
import de.michlb.sample.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sam on 5/9/2017.
 */

@Repository
public interface  StudentRepository extends JpaRepository<Student, Integer > {
}
