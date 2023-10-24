package state.mn.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import state.mn.us.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
