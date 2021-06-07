package com.team2.worldtrekking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Trek {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;
    private String difficulty;
    private String description;
    private String price;
    private String imageUrl;
    private Boolean bookNow;

    private Collection<Continent> continents;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Continent> getContinents() {
        return continents;
    }


    public String getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Boolean getBookNow() {
        return bookNow;
    }

    public Trek(Long id, String name, String type, String difficulty, String description,
                 String price, String imageUrl, Boolean bookNow, Continent... continents){

        this.id = id;
        this.name = name;
        this.type = type;
        this.difficulty = difficulty;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.bookNow = bookNow;
        this.continents = new ArrayList<>(Arrays.asList(continents));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trek trek = (Trek) o;
        return Objects.equals(id, trek.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
