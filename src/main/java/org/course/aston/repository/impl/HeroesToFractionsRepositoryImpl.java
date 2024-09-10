package org.course.aston.repository.impl;

import org.course.aston.entity.HeroesToFractions;
import org.course.aston.repository.HeroesToFractionsRepository;

import java.util.List;
import java.util.Optional;

public class HeroesToFractionsRepositoryImpl implements HeroesToFractionsRepository{
    @Override
    public Optional<HeroesToFractions> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<HeroesToFractions> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public HeroesToFractions save(HeroesToFractions heroesToFractions) {
        return null;
    }
}
