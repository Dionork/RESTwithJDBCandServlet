package org.course.aston.servlet.dto;

public class RoleIncomingDto {
    private String roleName;

    public RoleIncomingDto(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
