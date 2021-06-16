package com.team2.worldtrekking;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String imageUrl;


    @OneToMany(mappedBy="continent")
    public Collection<Trek> treks;

    @OneToMany(mappedBy="continent")
    public Collection<Region> regions;

    public Collection<Region> getRegion() {
        return regions;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }


/*    public String getRegion() {
        return region;
    }*/

public Continent(){}

    public Continent(String title, String imageUrl, Region... regions){
        this.title = title;
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}