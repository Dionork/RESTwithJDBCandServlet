package org.course.aston.repository;

import org.course.aston.entity.HeroesMaxHP;

import java.util.List;
import java.util.Optional;

public interface HeroesMaxHPRepository extends Repository<HeroesMaxHP, Long>{
    @Override
    Optional<HeroesMaxHP> findById(Long id);

    @Override
    List<HeroesMaxHP> findAll();

    @Override
    boolean deleteById(Long id);

    @Override
    HeroesMaxHP save(HeroesMaxHP heroesMaxHP);
}
