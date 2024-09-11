package org.course.aston.servlet.dto;

public class RoleOutGoingDto {
    private Long roleNameID;
    private String roleName;

    public RoleOutGoingDto(Long roleNameID, String roleName) {
        this.roleNameID = roleNameID;
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public Long getRoleNameID() {
        return roleNameID;
    }
}
