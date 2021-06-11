package com.team2.worldtrekking;

public class Difficulty {
    private Long id;
    private String difficultiesLevel;
    private String description;

    public Long getId() {
        return id;
    }

    public String getDifficultiesLevel() {
        return difficultiesLevel;
    }

    public String getDescription() {
        return description;
    }

    public Difficulty(Long id, String difficultiesLevel, String description) {
        this.id = id;
        this.difficultiesLevel = difficultiesLevel;
        this.description = description;
    }
}
