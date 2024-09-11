package org.course.aston.servlet.dto;

import java.util.List;

public class FractionsOutGoingDto {
    private Long fractionID;
    private String fractionName;
    private List<OnlyHeroOutGoingDto> heroesList;

    public FractionsOutGoingDto(Long fractionID, String fractionName, List<OnlyHeroOutGoingDto> heroesList) {
        this.fractionID = fractionID;
        this.fractionName = fractionName;
        this.heroesList = heroesList;
    }

    public Long getFractionID() {
        return fractionID;
    }

    public void setFractionID(Long fractionID) {
        this.fractionID = fractionID;
    }

    public String getFractionName() {
        return fractionName;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }

    public List<OnlyHeroOutGoingDto> getHeroesList() {
        return heroesList;
    }

    public void setHeroesList(List<OnlyHeroOutGoingDto> heroesList) {
        this.heroesList = heroesList;
    }
}
