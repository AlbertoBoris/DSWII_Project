package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Hora;
import com.project.server.repository.HoraDAO;

@Service
public class HoraServiceImpl {
	
	@Autowired
	private HoraDAO horaDAO;

	public List<Hora> listAll() {
		return horaDAO.findAll();
	}

	public void guardar(Hora bean) {
		horaDAO.save(bean);
	}

	public void eliminar(int cod) {
		horaDAO.deleteById(cod);
	}

	public Optional<Hora> buscar(int cod) {
		return horaDAO.findById(cod);
	}

}
