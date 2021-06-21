package com.project.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.server.entity.Reclamo;

public interface ReclamoDAO extends JpaRepository<Reclamo, Integer> {

	@Query("select x from Reclamo x where x.asunto = ?1")
	public List<Reclamo> listaPorAsunto(String asunto);

}
