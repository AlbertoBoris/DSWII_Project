package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Mascota;
import com.project.server.repository.MascotaDAO;

@Service
public class MascotaServiceImpl {
	
	@Autowired
	private MascotaDAO mascotaDAO;

	public List<Mascota> listAll() {
		return mascotaDAO.findAll();
	}

	public void guardar(Mascota bean) {
		mascotaDAO.save(bean);
	}

	public void eliminar(int cod) {
		mascotaDAO.deleteById(cod);
	}

	public Optional<Mascota> buscar(int cod) {
		return mascotaDAO.findById(cod);
	}

}
