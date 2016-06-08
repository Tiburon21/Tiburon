package com.diamond.domain;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByNombre(String nombreRole);

}
