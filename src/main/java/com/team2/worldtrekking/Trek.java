package com.team2.worldtrekking;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Trek {


    @Id
    @GeneratedValue
    private Long id;

    private String title;
//    private String type;
    private String difficulty;
    @Lob
    private String description;
    private String price;
    private String imageUrl;

    @ManyToOne
    private Continent continent;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

//    public String getType() {
//        return type;
//    }

    public String getDifficulty() {
        return difficulty;
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

    public Trek(String title, String difficulty, String description,
                String price, String imageUrl, Continent continent){

    public Trek(Long id, String title, String difficulty, String description,
                 String price, String imageUrl, Continent continent){

    public Trek(){}

    public Trek(String title, String difficulty, String description,
                 String price, String imageUrl, Continent continent){

        this.title = title;
//        this.type = type;
        this.difficulty = difficulty;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.continent = continent;
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