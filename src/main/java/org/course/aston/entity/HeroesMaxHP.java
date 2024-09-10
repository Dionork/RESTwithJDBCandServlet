package org.course.aston.entity;

public class HeroesMaxHP {
    private Long heroesMaxHpID;
    private Long heroID;
    private int maxHp;

    public HeroesMaxHP(Long heroesMaxHpID, Long heroID, int maxHp) {
        this.heroesMaxHpID = heroesMaxHpID;
        this.heroID = heroID;
        this.maxHp = maxHp;
    }

    public Long getHeroesMaxHpID() {
        return heroesMaxHpID;
    }

    public Long getHeroID() {
        return heroID;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
}
