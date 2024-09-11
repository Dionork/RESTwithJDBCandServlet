package org.course.aston.servlet.dto;

import java.util.List;

public class HeroesOutGoingDto {
    private Long heroesID;
    private String heroesName;
    private String heroesLastName;

    private RoleOutGoingDto role;
    private List<MaxHPOutGoingDto> maxHPList;
    private List<FractionsOutGoingDto> fractionsList;

    public HeroesOutGoingDto(Long heroesID, String heroesName, String heroesLastName, RoleOutGoingDto role, List<MaxHPOutGoingDto> maxHPList, List<FractionsOutGoingDto> fractionsList) {
        this.heroesID = heroesID;
        this.heroesName = heroesName;
        this.heroesLastName = heroesLastName;
        this.role = role;
        this.maxHPList = maxHPList;
        this.fractionsList = fractionsList;
    }

    public Long getHeroesID() {
        return heroesID;
    }

    public String getHeroesName() {
        return heroesName;
    }

    public String getHeroesLastName() {
        return heroesLastName;
    }

    public RoleOutGoingDto getRole() {
        return role;
    }

    public List<MaxHPOutGoingDto> getMaxHPList() {
        return maxHPList;
    }

    public List<FractionsOutGoingDto> getFractionsList() {
        return fractionsList;
    }
}
