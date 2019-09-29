package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IEstadoOrdenDAO;
import com.workshop.churroscuchito.models.EstadoOrden;
import com.workshop.churroscuchito.service.IEstadoOrdenService;

@Service

public class EstadoOrdenService implements IEstadoOrdenService{
	
	
	@Autowired
	IEstadoOrdenDAO service;
	@Override
	public EstadoOrden persist(EstadoOrden e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public List<EstadoOrden> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public EstadoOrden findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public EstadoOrden merge(EstadoOrden e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.deleteById(id);
	}

}