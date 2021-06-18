package com.team2.worldtrekking;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DifficultyRepository extends CrudRepository <Difficulty,Long> {
    Optional<Difficulty> findByDifficulty(String difficulty);
}
