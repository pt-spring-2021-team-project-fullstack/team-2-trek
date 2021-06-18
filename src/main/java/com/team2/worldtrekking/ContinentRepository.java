package com.team2.worldtrekking;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ContinentRepository extends CrudRepository<Continent,Long> {
    Optional<Continent> findByTitle(String title);
}
