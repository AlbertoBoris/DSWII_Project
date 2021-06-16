package com.project.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.server.entity.Reclamo;

public interface ReclamoDAO extends JpaRepository<Reclamo, Integer> {

}
