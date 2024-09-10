package org.course.aston.entity;

public class Heroes {
    private int heroId;
    private String heroName;
    private String heroLastname;
    private int roleNameID;

    public Heroes(int heroId, String heroName, String heroLastname, int roleNameID) {
        this.heroId = heroId;
        this.heroName = heroName;
        this.heroLastname = heroLastname;
        this.roleNameID = roleNameID;
    }

}
