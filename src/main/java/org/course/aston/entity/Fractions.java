package org.course.aston.entity;

public class Fractions {

    private Long fractionID;
    private String fractionName;

    public Fractions(Long fractionID, String fractionName) {
        this.fractionID = fractionID;
        this.fractionName = fractionName;
    }

    public Long getFractionID() {
        return fractionID;
    }

    public String getFractionName() {
        return fractionName;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }
}
