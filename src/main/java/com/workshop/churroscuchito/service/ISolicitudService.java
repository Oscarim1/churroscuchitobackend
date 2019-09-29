package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.DTO.SolicitudDTO;
import com.workshop.churroscuchito.models.Solicitud;

public interface ISolicitudService {
	
	Solicitud persist(SolicitudDTO e);
	List<Solicitud> getAll();
	Solicitud findById(Integer id);
	Solicitud merge(Solicitud e);
	void delete(Integer id);
	Solicitud persist(Solicitud e);
}