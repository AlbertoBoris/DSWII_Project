package com.project.server.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.server.entity.Estado;
import com.project.server.service.EstadoServiceImpl;

@RestController
@RequestMapping("/estado")
public class EstadoController {

	@Autowired
	private EstadoServiceImpl servicio;

	@GetMapping("/listar")
	@ResponseBody
	public List<Estado> listar() {
		return servicio.listAll();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Estado bean) {
		servicio.guardar(bean);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Estado bean) {
		servicio.guardar(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") int cod) {
		servicio.eliminar(cod);
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<Estado> buscar(@PathVariable("codigo") int cod) {
		return servicio.buscar(cod);
	}

}
