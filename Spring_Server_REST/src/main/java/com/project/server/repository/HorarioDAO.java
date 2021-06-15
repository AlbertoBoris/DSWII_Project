package com.project.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.server.entity.Horario;

public interface HorarioDAO extends JpaRepository<Horario, Integer> {

}
