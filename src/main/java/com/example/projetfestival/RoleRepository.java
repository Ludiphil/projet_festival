package com.example.projetfestival;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projetfestival.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}