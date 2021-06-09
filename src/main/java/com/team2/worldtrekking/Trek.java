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
    private String id;

    private String name;
//    private String type;
    private String difficulty;
    private String description;
    private String price;
//    private String imageUrl; //put this back in once images are in place
//    private Boolean bookNow;

    private String continent; // remove this once continent class is built out

//    private Collection<Continent> continents; put this back in once Continent class is built out & update populator

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
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

//    public Collection<Continent> getContinents() { // add back once Continent is built out & populator adjusted
//        return continents;
//    }

    public String getContinent() { //remove once Continent is built out
        return continent;
    }


    public String getPrice() {
        return price;
    }

//    public String getImageUrl() {
//        return imageUrl;
//    }


//    public Trek(Long id, String name, String type, String difficulty, String description,
//                 String price, String imageUrl, Continent... continents){     // reinstate this once Continent, type data, and imaages are in place

    public Trek(String id, String name, String difficulty, String description,
                String price, String continent){

        this.id = id;
        this.name = name;
//        this.type = type;
        this.difficulty = difficulty;
        this.description = description;
        this.price = price;
//        this.imageUrl = imageUrl;//        this.continents = new ArrayList<>(Arrays.asList(continents));
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
