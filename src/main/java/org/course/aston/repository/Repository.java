package org.course.aston.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T, K> {
    Optional <T> findById(K id);

    List<T> findAll();

    boolean deleteById(K id);

    T save(T t);
}
