package com.team2.worldtrekking;

import com.team2.worldtrekking.Trek;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekRepository extends CrudRepository<Trek, Long> {
    Optional<Trek> findByTitle(String title);
}
