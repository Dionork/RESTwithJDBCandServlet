package org.course.aston.service.impl;

import org.course.aston.service.FractionsService;
import org.course.aston.servlet.dto.FractionsOutGoingDto;
import org.course.aston.servlet.dto.FractionsUpdateDto;
import org.course.aston.servlet.dto.FractoinsIncomingDto;

import java.util.List;

public class FractionsServiceImpl implements FractionsService {
   private FractionsService instance;

    @Override
    public FractionsOutGoingDto save(FractoinsIncomingDto fractoinsIncomingDto) {
        return null;
    }

    @Override
    public void update(FractionsUpdateDto fractionsUpdateDto) {

    }

    @Override
    public FractionsOutGoingDto findById(Long fractionsId) {
        return null;
    }

    @Override
    public List<FractionsOutGoingDto> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long fractionsId) {

    }

    @Override
    public void deleteHeroesFromFractions(Long fractionsId, Long heroId) {

    }

    @Override
    public void addHeroesToFractions(Long fractionsId, Long heroId) {

    }
}
