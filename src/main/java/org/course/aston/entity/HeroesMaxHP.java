package org.course.aston.entity;

public class HeroesMaxHP {
    private int heroesMaxHpID;
    private int heroID;
    private int maxHp;

    public HeroesMaxHP(int heroesMaxHpID, int heroID, int maxHp) {
        this.heroesMaxHpID = heroesMaxHpID;
        this.heroID = heroID;
        this.maxHp = maxHp;
    }

    public int getHeroesMaxHpID() {
        return heroesMaxHpID;
    }

    public int getHeroID() {
        return heroID;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
}
