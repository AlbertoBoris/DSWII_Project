package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Horario;
import com.project.server.repository.HorarioDAO;

@Service
public class HorarioServiceImpl {
	
	@Autowired
	private HorarioDAO horarioDAO;

	public List<Horario> listAll() {
		return horarioDAO.findAll();
	}

	public void guardar(Horario bean) {
		horarioDAO.save(bean);
	}

	public void eliminar(int cod) {
		horarioDAO.deleteById(cod);
	}

	public Optional<Horario> buscar(int cod) {
		return horarioDAO.findById(cod);
	}

}
