package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IDetalleProductoDAO;
import com.workshop.churroscuchito.models.DetalleProducto;
import com.workshop.churroscuchito.service.IDetalleProductoService;

@Service

public class DetalleProductoService implements IDetalleProductoService{
	
	
	@Autowired
	IDetalleProductoDAO service;
	@Override
	public DetalleProducto persist(DetalleProducto e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public List<DetalleProducto> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public DetalleProducto findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findOne(id);
	}

	@Override
	public DetalleProducto merge(DetalleProducto e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}
