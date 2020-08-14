package com.dmire.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dmire.crud.models.Paciente;
import com.dmire.crud.repositories.IPaciente;

@RestController
@CrossOrigin(origins = "*", methods = { 
		RequestMethod.GET, 
		RequestMethod.POST, 
		RequestMethod.PUT, 
		RequestMethod.DELETE })
@RequestMapping("/api/pacientes")
public class PacienteController {
	
	@Autowired
	private IPaciente repo;
	
	@PostMapping("/paciente")
	public Paciente create(@Validated @RequestBody Paciente p) {
		return repo.insert(p);
	}
	
	@GetMapping("/")
	public List<Paciente> readAll() {
		return repo.findAll();
	}
	
	@PutMapping("/paciente/{id}")
	public Paciente update(@PathVariable String id, @Validated @RequestBody Paciente p) {
		return repo.save(p);
	}
	
	@DeleteMapping("/paciente/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}
}
