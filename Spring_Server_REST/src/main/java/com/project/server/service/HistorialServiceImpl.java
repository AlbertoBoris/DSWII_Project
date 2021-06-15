package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Historial;
import com.project.server.repository.HistorialDAO;

@Service
public class HistorialServiceImpl {

	@Autowired
	private HistorialDAO historialDAO;

	public List<Historial> listAll() {
		return historialDAO.findAll();
	}

	public void guardar(Historial bean) {
		historialDAO.save(bean);
	}

	public void eliminar(int cod) {
		historialDAO.deleteById(cod);
	}

	public Optional<Historial> buscar(int cod) {
		return historialDAO.findById(cod);
	}

}
