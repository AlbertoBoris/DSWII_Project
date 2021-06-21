package com.project.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.server.entity.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Integer> {

	@Query("select x from Pedido x where x.horario.nombre = ?1")
	public List<Pedido> listaPorUsuario(String usuario);
	
	@Query("select x from Pedido x where x.usuario.codigo = ?1")
	public List<Pedido> listaPorCodUsuario(int usuario);

}
