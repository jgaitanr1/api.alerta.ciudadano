package com.alerta.ciudadano.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alerta.ciudadano.api.models.ERole;
import com.alerta.ciudadano.api.models.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
