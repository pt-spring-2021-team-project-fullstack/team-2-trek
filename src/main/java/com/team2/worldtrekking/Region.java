package com.team2.worldtrekking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Region {


    @Id
    @GeneratedValue
    private Long id;
    private String imageUrl;
    private String title;

    @ManyToOne
    private Continent continent;

    @OneToMany(mappedBy="region")
    public Collection<Trek> treks;

    public Collection<Trek> getTreks() {
        return treks;
    }

    public Long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public Continent getContinent() {
        return continent;
    }

    public Region() {}

    public Region(String title, Continent continent/*, Trek...treks*/) {
        this.title = title;
        this.continent = continent;
        /*this.treks = new ArrayList<>(Arrays.asList(treks));*/
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