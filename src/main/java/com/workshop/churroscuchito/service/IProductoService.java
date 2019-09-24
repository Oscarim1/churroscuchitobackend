package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.DTO.ProductoDTO;
import com.workshop.churroscuchito.models.Producto;

public interface IProductoService {
	
	Producto persist(ProductoDTO e);
	List<Producto> getAll();
	Producto findById(Integer id);
	Producto merge(Producto e);
	void delete(Integer id);
}