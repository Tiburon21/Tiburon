package com.diamond.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="role")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_role", unique = true, nullable = false)
	private Long idRole;
	
	@ManyToMany(mappedBy="roles")
	private Collection<Organizador> organizadores;
	
	@NotNull	 	
	private String nombre;

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public Collection<Organizador> getOrganizadores() {
		return organizadores;
	}

	public void setOrganizadores(Collection<Organizador> organizadores) {
		this.organizadores = organizadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	

}
