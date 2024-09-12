package org.course.aston.servlet.mapper.impl;

import org.course.aston.entity.Heroes;
import org.course.aston.entity.HeroesMaxHP;
import org.course.aston.servlet.dto.MaxHPIncomingDTO;
import org.course.aston.servlet.dto.MaxHPOutGoingDto;
import org.course.aston.servlet.dto.MaxHPUpdateDto;
import org.course.aston.servlet.dto.OnlyHeroOutGoingDto;
import org.course.aston.servlet.mapper.MaxHPDtoMapper;

import java.util.List;

public class MaxHPDtoMapperImpl implements MaxHPDtoMapper {
    private static MaxHPDtoMapper instance;

    public static MaxHPDtoMapper getInstance() {
        if (instance == null) {
            instance = new MaxHPDtoMapperImpl();
        }
        return instance;
    }

    @Override
    public HeroesMaxHP map(MaxHPIncomingDTO maxHPIncomingDTO) {
        return new HeroesMaxHP(
                null,
                maxHPIncomingDTO.getMaxHP(),
                null
        );
    }

    @Override
    public MaxHPOutGoingDto map(HeroesMaxHP heroesMaxHP) {
        return new MaxHPOutGoingDto(
                heroesMaxHP.getHeroesMaxHpID(),
                heroesMaxHP.getMaxHp(),
                heroesMaxHP.getHeroes() == null ?
                        null :
                        new OnlyHeroOutGoingDto(
                                heroesMaxHP.getHeroes().getHeroID(),
                                heroesMaxHP.getHeroes().getHeroName(),
                                heroesMaxHP.getHeroes().getHeroLastname())
        );

    }

    @Override
    public List<MaxHPOutGoingDto> map(List<HeroesMaxHP> heroesMaxHPs) {
        return heroesMaxHPs.stream().map(this::map).toList();
    }

    @Override
    public List<HeroesMaxHP> mapUpdateList(List<MaxHPUpdateDto> maxHPUpdateDtos) {
        return maxHPUpdateDtos.stream().map(this::map).toList();
    }

    @Override
    public HeroesMaxHP map(MaxHPUpdateDto maxHPIncomingDto) {
        return new HeroesMaxHP(
                maxHPIncomingDto.getMaxHpID(),
                maxHPIncomingDto.getMaxHP(),
                new Heroes(
                        maxHPIncomingDto.getMaxHpID(),
                        null,
                        null,
                        null,
                        List.of(),
                        List.of()
                )
        );
    }
}
