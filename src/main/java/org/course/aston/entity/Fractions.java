package org.course.aston.entity;

public class Fractions {
    private int fractionID;
    private String fractionName;

    public Fractions(int fractionID, String fractionName) {
        this.fractionID = fractionID;
        this.fractionName = fractionName;
    }

    public int getFractionID() {
        return fractionID;
    }

    public String getFractionName() {
        return fractionName;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }
}
