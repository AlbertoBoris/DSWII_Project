package com.project.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.server.entity.Hora;

public interface HoraDAO extends JpaRepository<Hora, Integer> {

}
