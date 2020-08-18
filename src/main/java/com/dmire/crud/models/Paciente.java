package com.dmire.crud.models;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pacientes")
public class Paciente {
	
	@Id
	private String _id;
	
	private String nombres;
	
	private String apellidos;
	
	private LocalDate fecha_alta;
	
	private LocalDate fecha_baja;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(LocalDate fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public LocalDate getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(LocalDate fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	
	
}