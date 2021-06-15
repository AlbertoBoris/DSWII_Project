package com.project.server.entity;

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
@Table(name = "TB_PEDIDO")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PEDI")
	private int codigo;

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_PEDI")
	private java.util.Date fec_Ped;

	@ManyToOne /* Muchos a Uno */
	@JoinColumn(name = "ID_USU")
	private Usuario usuario;

	@ManyToOne /* Muchos a Uno */
	@JoinColumn(name = "ID_SERV")
	private Servicio servicio;

	@ManyToOne /* Muchos a Uno */
	@JoinColumn(name = "ID_ESTA")
	private Estado estado;

	@ManyToOne /* Muchos a Uno */
	@JoinColumn(name = "ID_HORARI")
	private Horario horario;
	
	@ManyToOne /* Muchos a Uno */
	@JoinColumn(name = "ID_HORA")
	private Hora hora;

	@Column(name = "IMPORTE")
	private double importe;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public java.util.Date getFec_Ped() {
		return fec_Ped;
	}

	public void setFec_Ped(java.util.Date fec_Ped) {
		this.fec_Ped = fec_Ped;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}	
	
}
