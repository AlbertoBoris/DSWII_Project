package com.project.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.server.entity.Historial;

public interface HistorialDAO extends JpaRepository<Historial, Integer> {

	@Query("select x from Historial x where x.mascota.nombre = ?1")
	public List<Historial> listaPorMascota(String mascota);

}
