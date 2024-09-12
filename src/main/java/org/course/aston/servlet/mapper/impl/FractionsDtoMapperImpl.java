package org.course.aston.servlet.mapper.impl;

import org.course.aston.entity.Fractions;
import org.course.aston.servlet.dto.FractionsOutGoingDto;
import org.course.aston.servlet.dto.FractionsUpdateDto;
import org.course.aston.servlet.dto.FractoinsIncomingDto;
import org.course.aston.servlet.dto.OnlyHeroOutGoingDto;
import org.course.aston.servlet.mapper.FractionsDtoMapper;

import java.util.List;

public class FractionsDtoMapperImpl implements FractionsDtoMapper {
    private static FractionsDtoMapper instance;

    public static FractionsDtoMapper getInstance() {
        if (instance == null) {
            instance = new FractionsDtoMapperImpl();
        }
        return instance;
    }

    @Override
    public Fractions map(FractoinsIncomingDto fractoinsIncomingDto) {
        return new Fractions(
                null,
                fractoinsIncomingDto.getFractoinsName(),
                null
        );
    }

    @Override
    public FractionsOutGoingDto map(Fractions fractions) {
        List<OnlyHeroOutGoingDto> heroesList = fractions.getHeroesList()
                .stream().map(heroes -> new OnlyHeroOutGoingDto(heroes.getHeroID(),
                        heroes.getHeroName(),
                        heroes.getHeroLastname())).toList();
        return new FractionsOutGoingDto(
                fractions.getFractionID(),
                fractions.getFractionName(),
                heroesList
        );
    }

    @Override
    public Fractions map(FractionsUpdateDto fractionsUpdateDto) {
        return new Fractions(
                fractionsUpdateDto.getFractionID(),
                fractionsUpdateDto.getFractionName(),
                null
        );
    }

    @Override
    public List<FractionsOutGoingDto> map(List<Fractions> fractionsList) {
        return fractionsList.stream().map(this::map).toList();
    }

    @Override
    public List<Fractions> mapUpdateList(List<FractionsUpdateDto> fractionsList) {
        return fractionsList.stream().map(this::map).toList();
    }
}
