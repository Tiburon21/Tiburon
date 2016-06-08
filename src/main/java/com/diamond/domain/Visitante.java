package com.diamond.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="visitante")
public class Visitante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_visitante", unique = true, nullable = false)
	private Long idVisitante;
	@NotNull
	private String nombre;
	@NotNull
	private String apellidoPaterno;
	@NotNull
	private String apellidoMaterno;
	@NotNull
	private String fechaNac;
	@NotNull
	private String email;
	@NotNull
	private Integer telefono;
	
	/*tabla visitante*/
	@JoinTable(name ="registro_visitante", 
			joinColumns = {
					@JoinColumn (name="Visitante_id_visitante", referencedColumnName="id_visitante")
					},
			inverseJoinColumns = {
					@JoinColumn (name ="Evento_id_evento", referencedColumnName="id_evento")
	       }
			
	)
	@ManyToMany
	private Collection<Evento> eventos;

	public Long getIdVisitante() {
		return idVisitante;
	}

	public void setIdVisitante(Long idVisitante) {
		this.idVisitante = idVisitante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Collection<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Collection<Evento> eventos) {
		this.eventos = eventos;
	}
	
	
}
