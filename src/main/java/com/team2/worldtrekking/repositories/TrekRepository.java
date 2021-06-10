package com.team2.worldtrekking.repositories;

import com.team2.worldtrekking.models.Trek;
import org.springframework.data.repository.CrudRepository;

public interface TrekRepository extends CrudRepository<Trek, Long> {
}
