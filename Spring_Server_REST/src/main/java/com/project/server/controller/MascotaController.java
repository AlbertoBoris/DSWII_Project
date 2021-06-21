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

import com.project.server.entity.Mascota;
import com.project.server.service.MascotaServiceImpl;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
	
	@Autowired
	private MascotaServiceImpl servicio;
	
	@GetMapping("/listar")
	@ResponseBody
	public List<Mascota> listar(){
		return servicio.listAll();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Mascota bean) {
		servicio.guardar(bean);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Mascota bean) {
		servicio.guardar(bean);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo")int cod) {
		servicio.eliminar(cod);
	}
	
	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<Mascota> buscar(@PathVariable("codigo")int cod) {
		return servicio.buscar(cod);
	}
	
	@GetMapping("/consulta2/{usuario}")
	@ResponseBody
	public List<Mascota> consulta(@PathVariable("usuario")int usuario){
		return servicio.listaXUsuario(usuario);
	}

}
