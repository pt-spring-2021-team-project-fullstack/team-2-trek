package com.team2.worldtrekking;


import org.hibernate.mapping.Array;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private  Long id;
    private  String name;
    private  Region region;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Region getRegion() {
        return region;
    }

    public Continent(Long id, String name,  Region region){
        this.id = id;
        this.name = name;
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
