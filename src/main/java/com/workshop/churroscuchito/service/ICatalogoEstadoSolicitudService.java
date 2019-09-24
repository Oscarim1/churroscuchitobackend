package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.models.CatalogoEstadoSolicitud;

public interface ICatalogoEstadoSolicitudService {
	
	CatalogoEstadoSolicitud persist(CatalogoEstadoSolicitud e);
	List<CatalogoEstadoSolicitud> getAll();
	CatalogoEstadoSolicitud findById(Integer id);
	CatalogoEstadoSolicitud merge(CatalogoEstadoSolicitud e);
	void delete(Integer id);
}