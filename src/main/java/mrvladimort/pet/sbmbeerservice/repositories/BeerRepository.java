package mrvladimort.pet.sbmbeerservice.repositories;

import mrvladimort.pet.sbmbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
    Optional<Beer> findById(UUID id);
}
