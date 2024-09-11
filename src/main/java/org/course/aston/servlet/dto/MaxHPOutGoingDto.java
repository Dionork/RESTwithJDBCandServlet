package org.course.aston.servlet.dto;

public class MaxHPOutGoingDto {
    private Long heroesMaxHPID;
    private String heroesMaxHP;
    private OnlyHeroOutGoingDto heroesDTO;

    public MaxHPOutGoingDto(Long heroesMaxHPID, String heroesMaxHP, OnlyHeroOutGoingDto heroesDTO) {
        this.heroesMaxHPID = heroesMaxHPID;
        this.heroesMaxHP = heroesMaxHP;
        this.heroesDTO = heroesDTO;
    }

    public Long getHeroesMaxHPID() {
        return heroesMaxHPID;
    }

    public void setHeroesMaxHPID(Long heroesMaxHPID) {
        this.heroesMaxHPID = heroesMaxHPID;
    }

    public String getHeroesMaxHP() {
        return heroesMaxHP;
    }

    public void setHeroesMaxHP(String heroesMaxHP) {
        this.heroesMaxHP = heroesMaxHP;
    }

    public OnlyHeroOutGoingDto getHeroesDTO() {
        return heroesDTO;
    }

    public void setHeroesDTO(OnlyHeroOutGoingDto heroesDTO) {
        this.heroesDTO = heroesDTO;
    }
}
