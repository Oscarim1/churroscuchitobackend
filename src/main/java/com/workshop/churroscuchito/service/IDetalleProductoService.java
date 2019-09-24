package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.models.DetalleProducto;

public interface IDetalleProductoService {
	
	DetalleProducto persist(DetalleProducto e);
	List<DetalleProducto> getAll();
	DetalleProducto findById(Integer id);
	DetalleProducto merge(DetalleProducto e);
	void delete(Integer id);
}