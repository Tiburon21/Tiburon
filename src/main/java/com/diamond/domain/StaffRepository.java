package com.diamond.domain;

import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Long> {
	
	Staff findByNombre(String nombrestaff);

}
