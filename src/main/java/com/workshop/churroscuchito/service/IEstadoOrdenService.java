package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.models.EstadoOrden;

public interface IEstadoOrdenService {
	
	EstadoOrden persist(EstadoOrden e);
	List<EstadoOrden> getAll();
	EstadoOrden findById(Integer id);
	EstadoOrden merge(EstadoOrden e);
	void delete(Integer id);
}