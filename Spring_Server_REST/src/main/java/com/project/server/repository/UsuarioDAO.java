package com.project.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.server.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

}
