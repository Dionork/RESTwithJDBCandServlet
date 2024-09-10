package org.course.aston.repository;

import org.course.aston.entity.Fractions;

import java.util.List;
import java.util.Optional;

public interface FractionsRepository extends Repository<Fractions,Long>{
    @Override
    Optional<Fractions> findById(Long id);

    @Override
    List<Fractions> findAll();

    @Override
    boolean deleteById(Long id);

    @Override
    Fractions save(Fractions fractions);
}
