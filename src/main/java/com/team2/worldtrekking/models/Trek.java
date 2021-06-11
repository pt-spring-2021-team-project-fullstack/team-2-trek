package com.team2.worldtrekking.models;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Trek {


    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String type;
    private String difficulty;
    private String description;
    private String price;
    private String imageUrl;
    private Boolean bookNow;
    private String region;

    @ManyToOne
    private Continent continent;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
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

    public Continent getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
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

    public Trek(String title, String difficulty, String description,
                 String price, String imageUrl, Boolean bookNow, Continent continent, String type, Region region){

        this.title = title;
        this.type = type;
        this.difficulty = difficulty;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.bookNow = bookNow;
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
