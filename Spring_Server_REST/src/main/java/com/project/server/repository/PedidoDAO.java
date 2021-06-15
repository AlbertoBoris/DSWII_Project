package com.project.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.server.entity.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Integer> {

}
