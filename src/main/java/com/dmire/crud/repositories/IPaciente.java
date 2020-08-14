package com.dmire.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dmire.crud.models.Paciente;

@Repository
public interface IPaciente extends MongoRepository<Paciente, String> {
	
}