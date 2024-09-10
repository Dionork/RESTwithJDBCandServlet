package org.course.aston.repository;

import javax.management.relation.Role;
import java.util.List;
import java.util.Optional;

public interface RoleRepository extends Repository<Role, Long>{
    @Override
    Optional<Role> findById(Long id);

    @Override
    List<Role> findAll();

    @Override
    boolean deleteById(Long id);

    @Override
    Role save(Role role);
}
