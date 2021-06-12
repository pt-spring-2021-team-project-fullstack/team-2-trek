package com.team2.worldtrekking;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Continent continent;

    @OneToMany(mappedBy="region")
    public Collection<Trek> treks;

    public Collection<Trek> getTreks() {
        return treks;
    }

    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return title;
    }

    public Continent getContinent() {
        return continent;
    }

    public Region(String title, Continent continent) {
        this.title = title;
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