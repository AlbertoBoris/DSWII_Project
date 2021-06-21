package com.project.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.server.entity.Servicio;

public interface ServicioDAO extends JpaRepository<Servicio, Integer> {

	@Query("select x from Servicio x where x.nombres = ?1")
	public List<Servicio> listaPorNombre(String nombre);

}
