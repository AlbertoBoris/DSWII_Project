package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Estado;
import com.project.server.repository.EstadoDAO;

@Service
public class EstadoServiceImpl {

	@Autowired
	private EstadoDAO estadoDAO;

	public List<Estado> listAll() {
		return estadoDAO.findAll();
	}

	public void guardar(Estado bean) {
		estadoDAO.save(bean);
	}

	public void eliminar(int cod) {
		estadoDAO.deleteById(cod);
	}

	public Optional<Estado> buscar(int cod) {
		return estadoDAO.findById(cod);
	}

}
