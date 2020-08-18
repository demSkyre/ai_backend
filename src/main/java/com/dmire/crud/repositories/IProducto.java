package com.dmire.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.dmire.crud.models.Producto;

@Repository
public interface IProducto extends MongoRepository<Producto, String> {
	
}