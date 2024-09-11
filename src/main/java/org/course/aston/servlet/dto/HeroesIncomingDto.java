package org.course.aston.servlet.dto;

import org.course.aston.entity.Roles;


public class HeroesIncomingDto {
    private String heroName;
    private String heroLastName;
    private Roles role;

    public HeroesIncomingDto(String heroName, String heroLastName, Roles role) {
        this.heroName = heroName;
        this.heroLastName = heroLastName;
        this.role = role;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getHeroLastName() {
        return heroLastName;
    }

    public Roles getRole() {
        return role;
    }
}
