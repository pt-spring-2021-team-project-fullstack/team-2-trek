package com.team2.worldtrekking;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Difficulty {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @Lob
    private String imageUrl;

    @OneToMany(mappedBy="difficulty")
    public Collection<Trek> treks;

    public Collection<Trek> getTreks() {
        return treks;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Difficulty() {}

    public Difficulty(String title) {
        this.title = title;
    }

    public Difficulty(String title, String imageUrl) {
        this.title = title;
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
