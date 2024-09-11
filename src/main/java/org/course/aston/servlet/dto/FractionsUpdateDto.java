package org.course.aston.servlet.dto;

public class FractionsUpdateDto {
    private Long fractionID;
    private String fractionName;

    public FractionsUpdateDto(Long fractionID, String fractionName) {
        this.fractionID = fractionID;
        this.fractionName = fractionName;
    }

    public Long getFractionID() {
        return fractionID;
    }

    public String getFractionName() {
        return fractionName;
    }
}
