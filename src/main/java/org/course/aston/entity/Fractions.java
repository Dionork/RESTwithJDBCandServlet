package org.course.aston.entity;

import org.course.aston.repository.HeroesToFractionsRepository;
import org.course.aston.repository.impl.HeroesToFractionsRepositoryImpl;

import java.util.List;

public class Fractions {

    private Long fractionID;
    private String fractionName;
    private List<Heroes> heroesList;

    public Fractions(Long fractionID, String fractionName) {
        this.fractionID = fractionID;
        this.fractionName = fractionName;
    }

    public Long getFractionID() {
        return fractionID;
    }

    public String getFractionName() {
        return fractionName;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }
    public List<Heroes> getHeroesList() {
        if (heroesList == null) {
            heroesList = new HeroesToFractionsRepositoryImpl().getHeroesByFractionID(fractionID);
        }
        return heroesList;
    }
    public void setHeroesList(List<Heroes> heroesList) {
        this.heroesList = heroesList;
    }
}
