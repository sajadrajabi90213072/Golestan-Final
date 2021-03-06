package de.michlb.sample.repositories;

import de.michlb.sample.domain.Pre;
import de.michlb.sample.domain.Prof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sam on 5/9/2017.
 */

@Repository
public interface ProfRepository extends JpaRepository<Prof, Integer >  {
}
