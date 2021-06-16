package com.project.server.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_reclamo")
public class Reclamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RECL")
	private int codigo;

	@ManyToOne /* Muchos a Uno */
	@JoinColumn(name = "ID_SERV")
	private Servicio servicioRecl;

	@Temporal(TemporalType.DATE)
	@Column(name = "FEC_INC")
	private Date fec_Inc;

	@Column(name = "ASUNTO")
	private String asunto;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "CONTACTO")
	private String contacto;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Servicio getServicioRecl() {
		return servicioRecl;
	}

	public void setServicioRecl(Servicio servicioRecl) {
		this.servicioRecl = servicioRecl;
	}

	public Date getFec_Inc() {
		return fec_Inc;
	}

	public void setFec_Inc(Date fec_Inc) {
		this.fec_Inc = fec_Inc;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

}
