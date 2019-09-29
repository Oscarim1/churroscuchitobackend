package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.models.DetalleSolicitud;

public interface IDetalleSolicitudService {
	
	DetalleSolicitud persist(DetalleSolicitud e);
	List<DetalleSolicitud> getAll();
	DetalleSolicitud findById(Integer id);
	DetalleSolicitud merge(DetalleSolicitud e);
	void delete(Integer id);
}