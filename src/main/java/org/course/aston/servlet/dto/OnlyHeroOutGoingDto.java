package org.course.aston.servlet.dto;

public class OnlyHeroOutGoingDto {
    private Long heroID;
    private String heroName;
    private String heroLastName;

    public OnlyHeroOutGoingDto(Long heroID, String heroName, String heroLastName) {
        this.heroID = heroID;
        this.heroName = heroName;
        this.heroLastName = heroLastName;
    }

    public Long getHeroID() {
        return heroID;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getHeroLastName() {
        return heroLastName;
    }
}
