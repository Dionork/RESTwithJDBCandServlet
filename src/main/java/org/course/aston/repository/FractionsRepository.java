package org.course.aston.repository;

import org.course.aston.entity.Fractions;

import java.util.List;

public interface FractionsRepository extends Repository<Fractions,Long>{
    @Override
    List<Fractions> findById(Long id);

    @Override
    List<Fractions> findAll();

    @Override
    boolean deleteById(Long id);

    @Override
    Fractions save(Fractions fractions);
}
