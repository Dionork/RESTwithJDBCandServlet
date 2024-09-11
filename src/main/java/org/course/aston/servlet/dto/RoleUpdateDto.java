package org.course.aston.servlet.dto;

public class RoleUpdateDto {
    private String roleName;
    private Long roleNameId;

	public RoleUpdateDto(String roleName, Long roleNameId) {
		this.roleName = roleName;
		this.roleNameId = roleNameId;
	}

	public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

	public Long getRoleNameId() {
		return roleNameId;
	}

	public void setRoleNameId(Long roleNameId) {
		this.roleNameId = roleNameId;
	}
}
