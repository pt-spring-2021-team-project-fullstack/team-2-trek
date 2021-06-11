package com.team2.worldtrekking.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Continent continent;
    @OneToMany
    private Collection<Trek> treks;

    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return name;
    }

    public String getTrekTitle() { return title; }

    public Continent getContinent() {
        return continent;
    }

    public Collection<Trek> getTrekking() {
        return treks;
    }

    public Region(long id, /*Trek trekking,*/ String name, Continent continent) {
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