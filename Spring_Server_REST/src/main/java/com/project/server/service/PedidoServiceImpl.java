package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Pedido;
import com.project.server.repository.PedidoDAO;

@Service
public class PedidoServiceImpl {

	@Autowired
	private PedidoDAO pedidoDAO;

	public List<Pedido> listAll() {
		return pedidoDAO.findAll();
	}

	public void guardar(Pedido bean) {
		pedidoDAO.save(bean);
	}

	public void eliminar(int cod) {
		pedidoDAO.deleteById(cod);
	}

	public Optional<Pedido> buscar(int cod) {
		return pedidoDAO.findById(cod);
	}

}
