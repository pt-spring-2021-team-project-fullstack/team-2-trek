package com.team2.worldtrekking.models;



import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private  String title;
    private  String region;
    private  String imageUrl;

    @OneToMany(mappedBy = "continent")
    public Collection<Trek> treks;

    public Collection<Trek> getTreks() {
        return treks;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getRegion() {
        return region;
    }

    public Continent(String name,  String region, String imageUrl){
        this.title = title;
        this.region = region;
    }
    public Continent(){}

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
