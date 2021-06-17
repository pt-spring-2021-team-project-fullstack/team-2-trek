package com.team2.worldtrekking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

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

    public Difficulty() {

    }

    public Difficulty(String difficultyLevel, String description, String imageUrl) {
        this.difficultyLevel = difficultyLevel;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Difficulty that = (Difficulty) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
