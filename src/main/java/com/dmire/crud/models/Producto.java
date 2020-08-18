package com.dmire.crud.models;

import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;

@Document(collection = "productos")
public class Producto {
	
	@Id
	private String _id;
	
	private String nombre;
	
	private Double precio;
	
	private LocalDate fecha_almacen;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getFecha_almacen() {
		return fecha_almacen;
	}

	public void setFecha_almacen(LocalDate fecha_almacen) {
		this.fecha_almacen = fecha_almacen;
	}
}
