package com.team2.worldtrekking;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Trek {


    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @Lob
    private String description;
    private String price;
    private String imageUrl;

    @ManyToOne
    private Difficulty difficulty;
    @ManyToOne
    private Continent continent;
    @ManyToOne
    private Region regions;


    public String getTitle() {
        return title;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Region getRegion() {
        return regions;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Trek(){}

    public Trek( String title, Difficulty difficulty, String description,
                 String price, String imageUrl, Continent continent, Region regions){

        this.title = title;
        this.difficulty = difficulty;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.continent = continent;
        this.regions = regions;

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