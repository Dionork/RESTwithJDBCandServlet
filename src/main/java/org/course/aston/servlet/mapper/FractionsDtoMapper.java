package org.course.aston.servlet.mapper;

import org.course.aston.entity.Fractions;
import org.course.aston.servlet.dto.FractionsOutGoingDto;
import org.course.aston.servlet.dto.FractionsUpdateDto;
import org.course.aston.servlet.dto.FractoinsIncomingDto;

import java.util.List;

public interface FractionsDtoMapper {
    Fractions map(FractoinsIncomingDto fractoinsIncomingDto);
    FractionsOutGoingDto map(Fractions fractions);
    Fractions map(FractionsUpdateDto fractionsUpdateDto);
    List<FractionsOutGoingDto> map(List<Fractions> fractionsList);
    List<Fractions> mapUpdateList(List<FractionsUpdateDto> fractionsList);
}
