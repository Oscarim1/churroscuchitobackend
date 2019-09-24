package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.ICatalogoEstadoSolicitudDAO;
import com.workshop.churroscuchito.models.CatalogoEstadoSolicitud;
import com.workshop.churroscuchito.service.ICatalogoEstadoSolicitudService;

@Service

public class CatalogoEstadoSolicitudService implements ICatalogoEstadoSolicitudService{
	
	
	@Autowired
	ICatalogoEstadoSolicitudDAO service;
	@Override
	public CatalogoEstadoSolicitud persist(CatalogoEstadoSolicitud e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public List<CatalogoEstadoSolicitud> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public CatalogoEstadoSolicitud findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findOne(id);
	}

	@Override
	public CatalogoEstadoSolicitud merge(CatalogoEstadoSolicitud e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}