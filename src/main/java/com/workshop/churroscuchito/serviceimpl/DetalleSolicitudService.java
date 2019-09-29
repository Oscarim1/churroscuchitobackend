package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IProductoDAO;
import com.workshop.churroscuchito.models.Producto;
import com.workshop.churroscuchito.DAO.IDetalleOrdenDAO;
import com.workshop.churroscuchito.models.DetalleOrden;
import com.workshop.churroscuchito.DAO.IDetalleSolicitudDAO;
import com.workshop.churroscuchito.DTO.DetalleSolicitudDTO;
import com.workshop.churroscuchito.models.DetalleSolicitud;
import com.workshop.churroscuchito.service.IDetalleSolicitudService;


@Service
public class DetalleSolicitudService implements IDetalleSolicitudService{
	@Autowired
	IDetalleSolicitudDAO service;
	IDetalleOrdenDAO servicedetalleorden;
	IProductoDAO serviceproducto;
	public DetalleSolicitud persist(DetalleSolicitudDTO e) {
		
		DetalleSolicitud tt= e.getDetalle();
		service.save(tt);
		DetalleOrden dp= e.getDetalleorden();
		servicedetalleorden.save(dp);
		Producto pp= e.getProducto();
		serviceproducto.save(pp);
		return tt;
	}

	@Override
	public List<DetalleSolicitud> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public DetalleSolicitud findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public DetalleSolicitud merge(DetalleSolicitud e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.deleteById(id);;
	}

	@Override
	public DetalleSolicitud persist(DetalleSolicitud e) {
		// TODO Auto-generated method stub
		return null;
	}
}