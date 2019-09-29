package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.ICatalogoEstadoOrdenDAO;
import com.workshop.churroscuchito.models.CatalogoEstadoOrden;
import com.workshop.churroscuchito.DAO.IDetalleOrdenDAO;
import com.workshop.churroscuchito.models.DetalleOrden;
import com.workshop.churroscuchito.DAO.IOrdenDAO;
import com.workshop.churroscuchito.DTO.OrdenDTO;
import com.workshop.churroscuchito.models.Orden;
import com.workshop.churroscuchito.service.IOrdenService;


@Service
public class OrdenService implements IOrdenService{
	@Autowired
	IOrdenDAO service;
	IDetalleOrdenDAO servicedetalleorden;
	ICatalogoEstadoOrdenDAO servicecatalogoestado;
	public Orden persist(OrdenDTO e) {
		
		Orden tt= e.getOrden();
		service.save(tt);
		DetalleOrden dp= e.getDetalleorden();
		servicedetalleorden.save(dp);
		CatalogoEstadoOrden cc= e.getCatalogoestadoorden();
		servicecatalogoestado.save(cc);
		return tt;
	}

	@Override
	public List<Orden> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public Orden findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public Orden merge(Orden e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.deleteById(id);;
	}
}