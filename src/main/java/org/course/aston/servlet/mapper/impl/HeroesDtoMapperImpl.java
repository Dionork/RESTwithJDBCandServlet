package org.course.aston.servlet.mapper.impl;

import org.course.aston.entity.Heroes;
import org.course.aston.servlet.dto.HeroesIncomingDto;
import org.course.aston.servlet.dto.HeroesOutGoingDto;
import org.course.aston.servlet.dto.HeroesUpdateDto;
import org.course.aston.servlet.mapper.FractionsDtoMapper;
import org.course.aston.servlet.mapper.HeroesDtoMapper;
import org.course.aston.servlet.mapper.MaxHPDtoMapper;
import org.course.aston.servlet.mapper.RoleDtoMapper;

import java.util.List;

public class HeroesDtoMapperImpl implements HeroesDtoMapper {
    private static RoleDtoMapper roleDtoMapper = new RoleDtoMapperImpl().getInstance();
    private static MaxHPDtoMapper maxHPDtoMapper = new MaxHPDtoMapperImpl().getInstance();
    private static FractionsDtoMapper fractionsDtoMapper = new FractionsDtoMapperImpl().getInstance();
    private static HeroesDtoMapper instance;
    public static HeroesDtoMapper getInstance() {
        if (instance == null) {
            instance = new HeroesDtoMapperImpl();
        }
        return instance;
    }
    @Override
    public Heroes map(HeroesIncomingDto heroesIncomingDto) {
        return new Heroes(
                null,
                heroesIncomingDto.getHeroName(),
                heroesIncomingDto.getHeroLastName(),
                heroesIncomingDto.getRole(),
                null,
                null
        );
    }

    @Override
    public Heroes map(HeroesUpdateDto heroesUpdateDto) {
        return new Heroes(
                heroesUpdateDto.getHeroesID(),
                heroesUpdateDto.getHeroesName(),
                heroesUpdateDto.getHeroesLastName(),
                roleDtoMapper.map(heroesUpdateDto.getRole()),
                maxHPDtoMapper.mapUpdateList(heroesUpdateDto.getMaxHPList()),
                fractionsDtoMapper.mapUpdateList(heroesUpdateDto.getFractionsList())
        );
    }

    @Override
    public HeroesOutGoingDto map(Heroes heroes) {
        return new HeroesOutGoingDto(
                heroes.getHeroID(),
                heroes.getHeroName(),
                heroes.getHeroLastname(),
                roleDtoMapper.map(heroes.getRole()),
                maxHPDtoMapper.map(heroes.getHeroesMaxHPList()),
                fractionsDtoMapper.map(heroes.getFractionsList())
        );
    }

    @Override
    public List<HeroesOutGoingDto> map(List<Heroes> heroes) {
        return heroes.stream().map(this::map).toList();
    }
}
