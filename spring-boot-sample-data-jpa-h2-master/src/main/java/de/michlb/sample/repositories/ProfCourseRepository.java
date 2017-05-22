package de.michlb.sample.repositories;

import de.michlb.sample.domain.Profcourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sam on 5/13/2017.
 */

@Repository
public interface ProfCourseRepository extends JpaRepository<Profcourse, Integer > {
}
