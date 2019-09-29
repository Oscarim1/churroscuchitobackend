package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IDetalleOrdenDAO;
import com.workshop.churroscuchito.models.DetalleOrden;
import com.workshop.churroscuchito.service.IDetalleOrdenService;

@Service

public class DetalleOrdenService implements IDetalleOrdenService{
	
	
	@Autowired
	IDetalleOrdenDAO service;
	@Override
	public DetalleOrden persist(DetalleOrden e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public List<DetalleOrden> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public DetalleOrden findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public DetalleOrden merge(DetalleOrden e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.deleteById(id);
	}
}