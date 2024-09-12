package org.course.aston.repository.impl;

import org.course.aston.entity.Fractions;
import org.course.aston.repository.FractionsRepository;

import java.util.List;

public class FractionsRepositoryImpl implements FractionsRepository {
    @Override
    public List<Fractions> findById(Long id) {

        return List.of();
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
