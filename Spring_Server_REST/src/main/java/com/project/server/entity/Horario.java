package com.project.server.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TB_HORARIO")
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HORARI")
	private int codigo;

	@Column(name = "NOMB_HORARI")
	private String nombre;

	@OneToMany(mappedBy = "horario") /* Uno a Muchos */
	@JsonIgnore
	private List<Servicio> listaServicio;

	@OneToMany(mappedBy = "servicio") /* Uno a Muchos */
	@JsonIgnore
	private List<Pedido> listaPedido;

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

	public List<Servicio> getListaServicio() {
		return listaServicio;
	}

	public void setListaServicio(List<Servicio> listaServicio) {
		this.listaServicio = listaServicio;
	}

	public List<Pedido> getListaPedido() {
		return listaPedido;
	}

	public void setListaPedido(List<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}

}
