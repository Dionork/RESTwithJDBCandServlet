package org.course.aston.entity;

public class Roles {
    private int roleNameID;
    private String roleName;

    public Roles(int roleNameID, String roleName) {
        this.roleNameID = roleNameID;
        this.roleName = roleName;
    }

    public int getRoleNameID() {
        return roleNameID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleNameID=" + roleNameID +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}

