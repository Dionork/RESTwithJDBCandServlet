package org.course.aston.entity;

import org.course.aston.repository.impl.HeroesRepositoryImpl;

public class HeroesMaxHP {
    private Long heroesMaxHpID;
    private Long heroID;
    private int maxHp;
    private Heroes heroes;

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

    public Heroes getHeroes() {
        if (heroes != null && heroes.getHeroID() > 0 && heroes.getHeroName() == null) {
            this.heroes = new HeroesRepositoryImpl().findById(heroes.getHeroID()).orElse(heroes);
        } else if (heroes != null && heroes.getHeroID() == null) {
            this.heroes = null;
        }
        return heroes;
    }

    public void setHeroes(Heroes heroes) {
        this.heroes = heroes;
    }
}
