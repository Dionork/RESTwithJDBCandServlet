package org.course.aston.servlet.mapper.impl;

import org.course.aston.entity.Roles;
import org.course.aston.servlet.dto.RoleIncomingDto;
import org.course.aston.servlet.dto.RoleOutGoingDto;
import org.course.aston.servlet.dto.RoleUpdateDto;
import org.course.aston.servlet.mapper.RoleDtoMapper;

import java.util.List;

public class RoleDtoMapperImpl implements RoleDtoMapper {
    private static RoleDtoMapper instance;
    public static RoleDtoMapper getInstance() {
        if (instance == null) {
            instance = new RoleDtoMapperImpl();
        }
        return instance;
    }
    @Override
    public Roles map(RoleIncomingDto roleIncomingDto) {
        return new Roles(
                null,
                roleIncomingDto.getRoleName()
        );
    }

    @Override
    public Roles map(RoleUpdateDto roleUpdateDto) {
        return new Roles(
                roleUpdateDto.getRoleNameId(),
                roleUpdateDto.getRoleName()
        );
    }

    @Override
    public RoleOutGoingDto map(Roles role) {
        return new RoleOutGoingDto(
                role.getRoleNameID(),
                role.getRoleName()
        );
    }

    @Override
    public List<RoleOutGoingDto> map(List<Roles> roles) {
        return roles.stream().map(this::map).toList();
    }
}
