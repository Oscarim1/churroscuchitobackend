package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IEstadoOrdenDAO;
import com.workshop.churroscuchito.DAO.ICatalogoEstadoOrdenDAO;
import com.workshop.churroscuchito.DTO.CatalogoEstadoOrdenDTO;
import com.workshop.churroscuchito.models.CatalogoEstadoOrden;
import com.workshop.churroscuchito.models.EstadoOrden;
import com.workshop.churroscuchito.service.ICatalogoEstadoOrdenService;
@Service
public class CatalogoEstadoOrdenService implements ICatalogoEstadoOrdenService{
	@Autowired
	ICatalogoEstadoOrdenDAO service;
	IEstadoOrdenDAO servicedetalle;
	public CatalogoEstadoOrden persist(CatalogoEstadoOrdenDTO e) {
		// TODO Auto-generated method stub
		CatalogoEstadoOrden tt= e.getCatalogoorden();
		service.save(tt);
		EstadoOrden dp=e.getEstadoorden();
		servicedetalle.save(dp);
		return tt;
		
	}

	@Override
	public List<CatalogoEstadoOrden> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public CatalogoEstadoOrden findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public CatalogoEstadoOrden merge(CatalogoEstadoOrden e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.deleteById(id);;
	}

	@Override
	public CatalogoEstadoOrden persist(CatalogoEstadoOrden e) {
		// TODO Auto-generated method stub
		return null;
	}
}