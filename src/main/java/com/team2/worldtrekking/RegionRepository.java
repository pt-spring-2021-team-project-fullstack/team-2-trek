package com.team2.worldtrekking;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegionRepository extends CrudRepository<Region, Long> {

    Region findRegionById(String id);
    Optional<Region> findByTitle(String region);

    /*Region findRegionByTitle(String title);*/
}