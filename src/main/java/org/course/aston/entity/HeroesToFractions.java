package org.course.aston.entity;

public class HeroesToFractions {
    private Long heroesToFractionsID;
    private Long heroID;
    private Long fractionID;

    public HeroesToFractions(Long heroesToFractionsID, Long heroID, Long fractionID) {
        this.heroesToFractionsID = heroesToFractionsID;
        this.heroID = heroID;
        this.fractionID = fractionID;
    }

    public Long getHeroesToFractionsID() {
        return heroesToFractionsID;
    }

    public Long getHeroID() {
        return heroID;
    }

    public Long getFractionID() {
        return fractionID;
    }

    public void setHeroesToFractionsID(Long heroesToFractionsID) {
        this.heroesToFractionsID = heroesToFractionsID;
    }

    public void setHeroID(Long heroID) {
        this.heroID = heroID;
    }

    public void setFractionID(Long fractionID) {
        this.fractionID = fractionID;
    }
}
