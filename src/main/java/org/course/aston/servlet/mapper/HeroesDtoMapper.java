package org.course.aston.servlet.mapper;

import org.course.aston.entity.Heroes;
import org.course.aston.servlet.dto.HeroesIncomingDto;
import org.course.aston.servlet.dto.HeroesOutGoingDto;
import org.course.aston.servlet.dto.HeroesUpdateDto;

import java.util.List;

public interface HeroesDtoMapper {
    Heroes map (HeroesIncomingDto heroesIncomingDto);
    Heroes map (HeroesUpdateDto heroesUpdateDto);
    HeroesOutGoingDto map (Heroes heroes);
    List<HeroesOutGoingDto> map (List<Heroes> heroes);
}
