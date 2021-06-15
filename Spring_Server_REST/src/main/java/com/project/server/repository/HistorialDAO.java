package com.project.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.server.entity.Historial;

public interface HistorialDAO extends JpaRepository<Historial, Integer> {

}
