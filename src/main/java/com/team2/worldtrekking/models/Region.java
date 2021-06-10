package com.team2.worldtrekking.models;

import com.team2.worldtrekking.models.Trek;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String continent;
    @OneToMany
    private Collection<Trek> trekking;

    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public Collection<Trek> getTrekking() {
        return trekking;
    }

    public Region(long id, Trek trekking, String name, String continent) {
        this.id = id;
        this.name = name;
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}