package com.diamond.domain;

import org.springframework.data.repository.CrudRepository;

public interface OrganizadorRepository extends CrudRepository<Organizador, Long> {
	Organizador findByNombre(String nombreorganizador);

}
