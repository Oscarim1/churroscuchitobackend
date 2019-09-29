package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.models.CatalogoEstadoOrden;

public interface ICatalogoEstadoOrdenService {
	
	CatalogoEstadoOrden persist(CatalogoEstadoOrden e);
	List<CatalogoEstadoOrden> getAll();
	CatalogoEstadoOrden findById(Integer id);
	CatalogoEstadoOrden merge(CatalogoEstadoOrden e);
	void delete(Integer id);
}