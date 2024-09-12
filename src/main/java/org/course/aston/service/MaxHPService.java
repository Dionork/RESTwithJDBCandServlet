package org.course.aston.service;

import org.course.aston.servlet.dto.MaxHPIncomingDTO;
import org.course.aston.servlet.dto.MaxHPOutGoingDto;
import org.course.aston.servlet.dto.MaxHPUpdateDto;

import java.util.List;

public interface MaxHPService {
    MaxHPOutGoingDto save(MaxHPIncomingDTO maxHP);
    void update(MaxHPUpdateDto maxHP);
    MaxHPOutGoingDto findById(Long maxHPId);
    List<MaxHPOutGoingDto> findAll();
    boolean delete(Long maxHPId);
}
