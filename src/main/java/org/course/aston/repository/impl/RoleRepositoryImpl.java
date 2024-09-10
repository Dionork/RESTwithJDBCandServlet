package org.course.aston.repository.impl;

import org.course.aston.repository.RoleRepository;

import javax.management.relation.Role;
import java.util.List;
import java.util.Optional;

public class RoleRepositoryImpl implements RoleRepository {
    @Override
    public Optional<Role> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public Role save(Role role) {
        return null;
    }
}
