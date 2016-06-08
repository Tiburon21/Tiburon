package com.diamond.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_staff", unique = true, nullable = false)
	private Long idStaff;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String cargo;
	
	/*tabla evento*/
	@ManyToOne
	@JoinColumn(name="Evento_id_evento")
	private Evento evento;
	
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Long getIdStaff() {
		return idStaff;
	}
	public void setIdStaff(Long idStaff) {
		this.idStaff = idStaff;
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	

}
