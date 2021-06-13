package com.team2.worldtrekking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Difficulty {
    @Id
    @GeneratedValue
    private Long id;

    private String difficultyLevel;
    private String description;
    private String imageUrl;

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Difficulty(String difficultyLevel, String description, String imageUrl) {
        this.difficultyLevel = difficultyLevel;
        this.description = description;
        this.imageUrl = imageUrl;
    }
}
