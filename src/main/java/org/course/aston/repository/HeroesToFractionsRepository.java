package org.course.aston.repository;

import org.course.aston.entity.HeroesToFractions;

import java.util.List;
import java.util.Optional;

public interface HeroesToFractionsRepository extends Repository<HeroesToFractions, Long>{
    @Override
    Optional<HeroesToFractions> findById(Long id);

    @Override
    List<HeroesToFractions> findAll();

    @Override
    boolean deleteById(Long id);

    @Override
    HeroesToFractions save(HeroesToFractions heroesToFractions);
}
