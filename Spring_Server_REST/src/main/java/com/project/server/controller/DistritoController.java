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

import com.project.server.entity.Distrito;
import com.project.server.service.DistritoServiceImpl;

@RestController
@RequestMapping("/distrito")
public class DistritoController {

	@Autowired
	private DistritoServiceImpl servicio;

	@GetMapping("/listar")
	@ResponseBody
	public List<Distrito> listar() {
		return servicio.listAll();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Distrito bean) {
		servicio.guardar(bean);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Distrito bean) {
		servicio.guardar(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") int cod) {
		servicio.eliminar(cod);
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<Distrito> buscar(@PathVariable("codigo") int cod) {
		return servicio.buscar(cod);
	}

}
