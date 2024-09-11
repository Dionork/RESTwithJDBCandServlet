package org.course.aston.servlet.dto;

public class MaxHPUpdateDto {
    private Long maxHpID;
    private String maxHP;
    private Long heroesID;

    public MaxHPUpdateDto(Long maxHpID, String maxHP, Long heroesID) {
        this.maxHpID = maxHpID;
        this.maxHP = maxHP;
        this.heroesID = heroesID;
    }

    public Long getMaxHpID() {
        return maxHpID;
    }

    public String getMaxHP() {
        return maxHP;
    }

    public Long getHeroesID() {
        return heroesID;
    }
}
