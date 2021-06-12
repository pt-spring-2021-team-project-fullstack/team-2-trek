package com.team2.worldtrekking;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "REGION")
public class Region {


    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Continent continent;
    @OneToMany
    private Collection<Trek> treks;

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

    public Region(/*Long id, */String title, Continent continent/*, Trek... treks*/) {
        /*this.id = id;*/
        this.title = title;
        this.continent = continent;
    }

    public Region() {}

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