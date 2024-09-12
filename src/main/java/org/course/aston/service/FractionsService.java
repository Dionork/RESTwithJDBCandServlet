package org.course.aston.service;

import org.course.aston.servlet.dto.FractionsOutGoingDto;
import org.course.aston.servlet.dto.FractionsUpdateDto;
import org.course.aston.servlet.dto.FractoinsIncomingDto;

import java.util.List;

public interface FractionsService {
    FractionsOutGoingDto save (FractoinsIncomingDto fractoinsIncomingDto);
    void update (FractionsUpdateDto fractionsUpdateDto);
    FractionsOutGoingDto findById (Long fractionsId);
    List<FractionsOutGoingDto> findAll ();
    void delete (Long fractionsId);
    void deleteHeroesFromFractions (Long fractionsId, Long heroId);
    void addHeroesToFractions (Long fractionsId, Long heroId);
}
