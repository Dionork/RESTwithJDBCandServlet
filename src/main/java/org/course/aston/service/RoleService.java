package org.course.aston.service;

import org.course.aston.servlet.dto.RoleIncomingDto;
import org.course.aston.servlet.dto.RoleOutGoingDto;
import org.course.aston.servlet.dto.RoleUpdateDto;

import java.util.List;

public interface RoleService {
    RoleOutGoingDto save(RoleIncomingDto role);
    void update(RoleUpdateDto role);
    RoleOutGoingDto findById(Long roleId);
    List<RoleOutGoingDto> findAll();
    boolean deleteById(Long roleId);
}
