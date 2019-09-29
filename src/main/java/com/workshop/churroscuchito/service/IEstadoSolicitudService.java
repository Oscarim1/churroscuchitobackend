package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.DTO.EstadoSolicitudDTO;
import com.workshop.churroscuchito.models.EstadoSolicitud;

public interface IEstadoSolicitudService {
	
	EstadoSolicitud persist(EstadoSolicitudDTO e);
	List<EstadoSolicitud> getAll();
	EstadoSolicitud findById(Integer id);
	EstadoSolicitud merge(EstadoSolicitud e);
	void delete(Integer id);
}