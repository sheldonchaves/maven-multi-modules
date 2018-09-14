package io.kyrios.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KyriosSample {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private int classification;
    private boolean active;

    protected KyriosSample(){}

    public KyriosSample(String name, int classification, boolean active){
        this.name = name;
        this.classification = classification;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public int getClassification() {
        return classification;
    }

    public long getId() {
        return id;
    }

    public boolean isActived() {
        return active;
    }
}
