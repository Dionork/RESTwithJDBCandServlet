package org.course.aston.service;

import org.course.aston.servlet.dto.HeroesIncomingDto;
import org.course.aston.servlet.dto.HeroesOutGoingDto;
import org.course.aston.servlet.dto.HeroesUpdateDto;

import java.util.List;

public interface HeroesService {
    HeroesOutGoingDto save(HeroesIncomingDto heroesDto);
    void update(HeroesUpdateDto heroesDto);
    HeroesOutGoingDto findById(Long heroId);
    List<HeroesOutGoingDto> findAll();
    void delete(Long heroId);
}
