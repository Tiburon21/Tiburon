package com.diamond.domain;

import org.springframework.data.repository.CrudRepository;

public interface OrganizadorRepository extends CrudRepository<Organizador, Long> {
	
	Organizador findBy(String usuario);

}
