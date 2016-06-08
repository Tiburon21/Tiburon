package com.diamond.domain;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="organizador")
public class Organizador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_organizador", unique = true, nullable = false)
	private Integer idOrganizador;
	@NotNull
	private String nombre;
	@NotNull
	private String apellidoPaterno;
	@NotNull
	private String apellidoMaterno;
	@NotNull
	private String calle;
	@NotNull
	private String colonia;
	private Integer numInt;
	@NotNull
	private Integer cp;
	@NotNull
	private String email;
	@NotNull
	private Integer telefono;
	@NotNull
	private String usuario;
	@NotNull
	private String password;
	
	@OneToMany(mappedBy="organizador")
	private List<Evento> listaeventos;
	

	@JoinTable(name ="organizador_roles", 
			joinColumns = {
					@JoinColumn (name="Organizador_id_organizador", referencedColumnName="id_organizador")
					},
			inverseJoinColumns = {
					@JoinColumn (name ="Role_id_role", referencedColumnName="id_role")
	       }
			
	)
	@ManyToMany
	private Collection<Role> roles;
	
	public Collection<Role> getRoles() {
		return roles;
	}
	

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public Integer getIdOrganizador() {
		return idOrganizador;
	}

	public void setIdOrganizador(Integer idOrganizador) {
		this.idOrganizador = idOrganizador;
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

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Integer getNumInt() {
		return numInt;
	}

	public void setNumInt(Integer numInt) {
		this.numInt = numInt;
	}


	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Evento> getListaeventos() {
		return listaeventos;
	}
	
	public void setListaeventos(List<Evento> listaeventos) {
		this.listaeventos = listaeventos;
	}
	
	

}