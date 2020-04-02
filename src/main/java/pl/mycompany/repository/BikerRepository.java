package pl.mycompany.repository;

import pl.mycompany.domain.Biker;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Biker entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BikerRepository extends JpaRepository<Biker, Long> {
}
