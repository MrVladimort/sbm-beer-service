package mrvladimort.pet.sbmbeerservice.repositories;

import mrvladimort.pet.sbmbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface BeerRepository extends JpaRepository<Beer, UUID> {
    Optional<Beer> findById(UUID id);
}
