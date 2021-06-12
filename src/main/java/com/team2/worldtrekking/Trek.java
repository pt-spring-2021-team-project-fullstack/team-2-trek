package com.team2.worldtrekking;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Trek {


    @Id
    @GeneratedValue

    private String title;
    private String difficulty;
    @Lob
    private String description;
    private String price;
    private String imageUrl;

    @ManyToOne
    private Continent continent;
    @ManyToOne
    private Region region;

    public String getTitle() {
        return title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getDescription() {
        return description;
    }

    public Continent getContinent() {
        return continent;
    }

    public Region getRegion() {
        return region;
    }

    public String getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Trek(String title, String difficulty, String description,
                 String price, String imageUrl, Continent continent, Region region){

        this.difficulty = difficulty;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.continent = continent;
        this.region = region;
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
