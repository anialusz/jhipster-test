package pl.mycompany.repository;

import pl.mycompany.domain.Glasses;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Glasses entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GlassesRepository extends JpaRepository<Glasses, Long> {
}
