package org.course.aston.servlet.mapper;

import org.course.aston.entity.HeroesMaxHP;
import org.course.aston.servlet.dto.MaxHPIncomingDTO;
import org.course.aston.servlet.dto.MaxHPOutGoingDto;
import org.course.aston.servlet.dto.MaxHPUpdateDto;

import java.util.List;

public interface MaxHPDtoMapper {
    HeroesMaxHP map(MaxHPIncomingDTO maxHPIncomingDTO);
    MaxHPOutGoingDto map(HeroesMaxHP heroesMaxHP);
    List<MaxHPOutGoingDto> map(List<HeroesMaxHP> heroesMaxHPs);
    List<HeroesMaxHP> mapUpdateList(List<MaxHPUpdateDto> maxHPUpdateDtos);
    HeroesMaxHP map(MaxHPUpdateDto maxHPIncomingDto);
}
