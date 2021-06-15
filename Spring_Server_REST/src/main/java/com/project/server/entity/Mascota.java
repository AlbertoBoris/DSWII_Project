package com.project.server.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_mascota")
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MASC")
	private int codigo;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "ANIMAL")
	private String animal;

	@Column(name = "RAZA")
	private String raza;

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_NACI")
	private Date fec_Nac;

	@ManyToOne /* Muchos a Uno */
	@JoinColumn(name = "ID_USU")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "mascota") /* Uno a Muchos */
	@JsonIgnore
	private List<Historial> listahistorial;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Date getFec_Nac() {
		return fec_Nac;
	}

	public void setFec_Nac(Date fec_Nac) {
		this.fec_Nac = fec_Nac;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
