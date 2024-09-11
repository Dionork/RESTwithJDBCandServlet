package org.course.aston.entity;

import org.course.aston.repository.impl.FractionsRepositoryImpl;
import org.course.aston.repository.impl.HeroesMaxHPRepositoryImpl;

import java.util.Optional;

public class Heroes {
    private Long heroID;
    private String heroName;
    private String heroLastname;
    private Roles role;
    private Optional<HeroesMaxHP> heroesMaxHPList;
    private Optional<Fractions> fractionsList;

    public Heroes(Long heroId, String heroName, String heroLastname, Roles role, Optional<HeroesMaxHP> heroesMaxHPList, Optional<Fractions> fractionsList) {
        this.heroID = heroId;
        this.heroName = heroName;
        this.heroLastname = heroLastname;
        this.role = role;
        this.heroesMaxHPList = heroesMaxHPList;
        this.fractionsList = fractionsList;
    }

    public Long getHeroID() {
        return heroID;
    }

    public void setHeroID(Long heroID) {
        this.heroID = heroID;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroLastname() {
        return heroLastname;
    }

    public void setHeroLastname(String heroLastname) {
        this.heroLastname = heroLastname;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Optional<HeroesMaxHP> getHeroesMaxHPList() {
        if (heroesMaxHPList == null) {
            this.heroesMaxHPList = new HeroesMaxHPRepositoryImpl().findById(heroID);
        }
        return heroesMaxHPList;
    }

    public void setHeroesMaxHPList(Optional<HeroesMaxHP> heroesMaxHPList) {
        this.heroesMaxHPList = heroesMaxHPList;
    }

    public Optional<Fractions> getFractionsList() {
        if (fractionsList == null) {
            this.fractionsList = new FractionsRepositoryImpl().findById(heroID);
        }
        return fractionsList;
    }

    public void setFractionsList(Optional<Fractions> fractionsList) {
        this.fractionsList = fractionsList;
    }

}
