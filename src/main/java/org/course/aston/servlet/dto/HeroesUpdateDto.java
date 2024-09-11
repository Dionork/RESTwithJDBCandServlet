package org.course.aston.servlet.dto;

import java.util.List;

public class HeroesUpdateDto {
    private Long heroesID;
    private String heroesName;
    private String heroesLastName;
    private RoleUpdateDto role;
    private List<MaxHPUpdateDto> maxHPList;
    private List<FractionsUpdateDto> fractionsList;

    public HeroesUpdateDto(Long heroesID, String heroesName, String heroesLastName, RoleUpdateDto role, List<MaxHPUpdateDto> maxHPList, List<FractionsUpdateDto> fractionsList) {
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

    public RoleUpdateDto getRole() {
        return role;
    }

    public List<MaxHPUpdateDto> getMaxHPList() {
        return maxHPList;
    }

    public List<FractionsUpdateDto> getFractionsList() {
        return fractionsList;
    }
}
