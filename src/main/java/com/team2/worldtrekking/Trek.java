package com.team2.worldtrekking;

public class Trek {

    private Long id;
    private String name;
    private String type;
    private String difficulty;
    private String description;
    private String continent;
    private String region;
    private String price;
    private String imageUrl;
    private Boolean bookNow;

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

    public String getContinent() {
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

    public Trek(Long id, String name, String type, String difficulty, String description,
                String continent, String region, String price, String imageUrl, Boolean bookNow){

        this.id = id;
        this.name = name;
        this.type = type;
        this.difficulty = difficulty;
        this.description = description;
        this.continent = continent;
        this.region = region;
        this.price = price;
        this.imageUrl = imageUrl;
        this.bookNow = bookNow;
    }


}
