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

import com.project.server.entity.Servicio;
import com.project.server.service.ServicioServiceImpl;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

	@Autowired
	private ServicioServiceImpl servicio;

	@GetMapping("/listar")
	@ResponseBody
	public List<Servicio> listar() {
		return servicio.listAll();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Servicio bean) {
		servicio.guardar(bean);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Servicio bean) {
		servicio.guardar(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") int cod) {
		servicio.eliminar(cod);
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<Servicio> buscar(@PathVariable("codigo") int cod) {
		return servicio.buscar(cod);
	}
	
	@GetMapping("/consulta/{nombre}")
	@ResponseBody
	public List<Servicio> consulta(@PathVariable("nombre")String nombre) {
		return servicio.listaServicios(nombre);
	}

}
