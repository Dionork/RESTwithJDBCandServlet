package org.course.aston.repository.impl;

import org.course.aston.entity.HeroesMaxHP;
import org.course.aston.repository.HeroesMaxHPRepository;

import java.util.List;
import java.util.Optional;

public class HeroesMaxHPRepositoryImpl implements HeroesMaxHPRepository {
    @Override
    public Optional<HeroesMaxHP> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<HeroesMaxHP> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public HeroesMaxHP save(HeroesMaxHP heroesMaxHP) {
        return null;
    }
}
