package com.team2.worldtrekking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Difficulty {
    @Id
    @GeneratedValue
    private Long id;

    private String difficulty;

    @OneToMany(mappedBy="difficulty")
    public Collection<Trek> treks;


    public Collection<Trek> getTreks() {
        return treks;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public Long getId() {
        return id;
    }


    public Difficulty() {
    }

    public Difficulty(String difficulty) {
        this.difficulty = difficulty;
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
