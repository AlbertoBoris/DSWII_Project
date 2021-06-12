package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Distrito;
import com.project.server.repository.DistritoDAO;

@Service
public class DistritoServiceImpl {

	@Autowired
	private DistritoDAO distritoDAO;

	public List<Distrito> listAll() {
		return distritoDAO.findAll();
	}

	public void guardar(Distrito bean) {
		distritoDAO.save(bean);
	}

	public void eliminar(int cod) {
		distritoDAO.deleteById(cod);
	}

	public Optional<Distrito> buscar(int cod) {
		return distritoDAO.findById(cod);
	}

}
