package com.team2.worldtrekking;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek, Long> {
    Optional<Trek> findByTitle(String title);

//    Collection<Course> findByTopicsContains(Topic topic);
    Collection<Trek> findByDifficulty(Difficulty difficulty);

    Collection<Trek> findByContinent(Continent continent);
}
