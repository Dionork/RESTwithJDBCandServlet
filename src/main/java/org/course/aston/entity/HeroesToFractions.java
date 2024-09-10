package org.course.aston.entity;

public class HeroesToFractions {
    private int heroesToFractionsID;
    private int heroID;
    private int fractionID;

    public HeroesToFractions(int heroesToFractionsID, int heroID, int fractionID) {
        this.heroesToFractionsID = heroesToFractionsID;
        this.heroID = heroID;
        this.fractionID = fractionID;
    }

    public int getHeroesToFractionsID() {
        return heroesToFractionsID;
    }

    public int getHeroID() {
        return heroID;
    }

    public int getFractionID() {
        return fractionID;
    }

    public void setHeroesToFractionsID(int heroesToFractionsID) {
        this.heroesToFractionsID = heroesToFractionsID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public void setFractionID(int fractionID) {
        this.fractionID = fractionID;
    }
}
