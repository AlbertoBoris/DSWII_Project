package com.project.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.server.entity.Mascota;

public interface MascotaDAO  extends JpaRepository<Mascota, Integer>{
	
	@Query("select x from Mascota x where x.usuario.codigo = :param")
	List<Mascota> listaPorUsuario(@Param(value = "param") int usuario);

}
