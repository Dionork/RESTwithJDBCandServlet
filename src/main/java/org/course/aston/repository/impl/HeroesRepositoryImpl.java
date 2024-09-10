package org.course.aston.repository.impl;

import org.course.aston.entity.Heroes;
import org.course.aston.repository.HeroesRepository;

import java.util.List;
import java.util.Optional;

public class HeroesRepositoryImpl implements HeroesRepository {
    @Override
    public Optional<Heroes> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Heroes> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public Heroes save(Heroes heroes) {
        return null;
    }
}
