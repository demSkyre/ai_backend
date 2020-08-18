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
import com.dmire.crud.models.Producto;
import com.dmire.crud.repositories.IProducto;

@RestController
@CrossOrigin(origins = "*", methods = { 
		RequestMethod.GET, 
		RequestMethod.POST, 
		RequestMethod.PUT, 
		RequestMethod.DELETE })
@RequestMapping("/api/productos")
public class ProductoController {
	
	@Autowired
	private IProducto repo;
	
	@PostMapping("/producto")
	public Producto create(@Validated @RequestBody Producto p) {
		return repo.insert(p);
	}
	
	@GetMapping("/")
	public List<Producto> readAll() {
		return repo.findAll();
	}
	
	@PutMapping("/producto/{id}")
	public Producto update(@PathVariable String id, @Validated @RequestBody Producto p) {
		return repo.save(p);
	}
	
	@DeleteMapping("/producto/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}
}
