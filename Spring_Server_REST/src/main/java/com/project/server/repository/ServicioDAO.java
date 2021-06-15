package com.project.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.server.entity.Servicio;

public interface ServicioDAO extends JpaRepository<Servicio, Integer>{

}
