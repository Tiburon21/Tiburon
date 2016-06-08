package com.diamond.domain;

import org.springframework.data.repository.CrudRepository;

public interface VisitanteRepository extends CrudRepository<Visitante, Long> {
	Visitante findByNombre(String nombrevisitante);

}
