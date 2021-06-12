package com.project.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.server.entity.Usuario;
import com.project.server.repository.UsuarioDAO;

@Service
public class UsuarioServiceImpl {

	@Autowired
	private UsuarioDAO usuarioDAO;

	public List<Usuario> listAll() {
		return usuarioDAO.findAll();
	}

	public void guardar(Usuario bean) {
		usuarioDAO.save(bean);
	}

	public void eliminar(int cod) {
		usuarioDAO.deleteById(cod);
	}

	public Optional<Usuario> buscar(int cod) {
		return usuarioDAO.findById(cod);
	}

}
