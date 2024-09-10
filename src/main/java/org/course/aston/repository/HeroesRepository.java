package org.course.aston.repository;

import org.course.aston.entity.Heroes;

import java.util.List;
import java.util.Optional;

public interface HeroesRepository extends Repository<Heroes, Long>{
    @Override
    Optional<Heroes> findById(Long id);

    @Override
    List<Heroes> findAll();

    @Override
    boolean deleteById(Long id);

    @Override
    Heroes save(Heroes heroes);
}
