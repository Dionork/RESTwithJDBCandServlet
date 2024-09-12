package org.course.aston.servlet.mapper;


import org.course.aston.entity.Roles;
import org.course.aston.servlet.dto.RoleIncomingDto;
import org.course.aston.servlet.dto.RoleOutGoingDto;
import org.course.aston.servlet.dto.RoleUpdateDto;

import java.util.List;

public interface RoleDtoMapper {
    Roles map(RoleIncomingDto roleIncomingDto);
    Roles map(RoleUpdateDto roleUpdateDto);
    RoleOutGoingDto map(Roles role);
    List<RoleOutGoingDto> map(List<Roles> roles);
}
