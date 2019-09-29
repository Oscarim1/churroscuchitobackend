package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IDetalleProductoDAO;
import com.workshop.churroscuchito.DAO.IProductoDAO;
import com.workshop.churroscuchito.DTO.ProductoDTO;
import com.workshop.churroscuchito.models.Producto;
import com.workshop.churroscuchito.models.DetalleProducto;
import com.workshop.churroscuchito.service.IProductoService;
@Service
public class ProductoService implements IProductoService{
	@Autowired
	IProductoDAO service;
	IDetalleProductoDAO servicedetalle;
	public Producto persist(ProductoDTO e) {
		// TODO Auto-generated method stub
		Producto tt= e.getProducto();
		service.save(tt);
		DetalleProducto dp=e.getDetalleproducto();
		servicedetalle.save(dp);
		return tt;
		
	}

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public Producto findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public Producto merge(Producto e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.deleteById(id);;
	}



}