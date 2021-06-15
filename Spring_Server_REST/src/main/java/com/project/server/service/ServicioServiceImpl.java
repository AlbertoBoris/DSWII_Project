package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Servicio;
import com.project.server.repository.ServicioDAO;

@Service
public class ServicioServiceImpl {

	@Autowired
	private ServicioDAO servicioDAO;

	public List<Servicio> listAll() {
		return servicioDAO.findAll();
	}

	public void guardar(Servicio bean) {
		servicioDAO.save(bean);
	}

	public void eliminar(int cod) {
		servicioDAO.deleteById(cod);
	}

	public Optional<Servicio> buscar(int cod) {
		return servicioDAO.findById(cod);
	}

}
