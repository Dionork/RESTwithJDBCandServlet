package org.course.aston.repository.impl;

import org.course.aston.entity.Fractions;
import org.course.aston.repository.FractionsRepository;

import java.util.List;
import java.util.Optional;

public class FractionsRepositoryImpl implements FractionsRepository {
    @Override
    public Optional<Fractions> findById(Long id) {

        return Optional.empty();
    }

    @Override
    public List<Fractions> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public Fractions save(Fractions fractions) {
        return null;
    }
}
