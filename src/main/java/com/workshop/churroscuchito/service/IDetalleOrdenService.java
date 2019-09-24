package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.models.DetalleOrden;

public interface IDetalleOrdenService {
	
	DetalleOrden persist(DetalleOrden e);
	List<DetalleOrden> getAll();
	DetalleOrden findById(Integer id);
	DetalleOrden merge(DetalleOrden e);
	void delete(Integer id);
}