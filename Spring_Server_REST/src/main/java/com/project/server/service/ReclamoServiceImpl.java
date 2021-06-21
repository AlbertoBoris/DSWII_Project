package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Reclamo;
import com.project.server.repository.ReclamoDAO;

@Service
public class ReclamoServiceImpl {

	@Autowired
	private ReclamoDAO reclamoDAO;

	public List<Reclamo> listAll() {
		return reclamoDAO.findAll();
	}

	public void guardar(Reclamo bean) {
		reclamoDAO.save(bean);
	}

	public void eliminar(int cod) {
		reclamoDAO.deleteById(cod);
	}

	public Optional<Reclamo> buscar(int cod) {
		return reclamoDAO.findById(cod);
	}

	public List<Reclamo> listaReclamo(String nombre) {
		return reclamoDAO.listaPorAsunto(nombre);
	}

}
