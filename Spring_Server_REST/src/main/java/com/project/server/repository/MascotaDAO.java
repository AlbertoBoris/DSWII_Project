package com.project.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.server.entity.Mascota;

public interface MascotaDAO  extends JpaRepository<Mascota, Integer>{

}
