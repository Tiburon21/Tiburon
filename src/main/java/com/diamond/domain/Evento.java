package com.diamond.domain;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_evento", unique = true, nullable = false)
	private Integer idEvento;
	@NotNull
	private String nombre;
	@NotNull
	private Integer salon;
	@NotNull
	private Date fechaEvento;

	/*map tabla organizador*/
	@ManyToOne
	@JoinColumn(name="Organizador_id_organizador")
	private Organizador organizador;
	
	
	/*tabla visitante*/
	@ManyToMany(mappedBy="eventos")
	private Collection<Visitante> visitantes;
	
	/*tabla staff*/
	@OneToMany(mappedBy="evento")
	private List<Staff> Listastaff;

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSalon() {
		return salon;
	}

	public void setSalon(Integer salon) {
		this.salon = salon;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public Organizador getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	public Collection<Visitante> getVisitantes() {
		return visitantes;
	}

	public void setVisitantes(Collection<Visitante> visitantes) {
		this.visitantes = visitantes;
	}

	public List<Staff> getListastaff() {
		return Listastaff;
	}

	public void setListastaff(List<Staff> listastaff) {
		Listastaff = listastaff;
	}

	


}
