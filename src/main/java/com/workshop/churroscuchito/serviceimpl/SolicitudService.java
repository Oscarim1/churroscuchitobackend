package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IEstadoSolicitudDAO;
import com.workshop.churroscuchito.models.EstadoSolicitud;

import com.workshop.churroscuchito.DAO.IDetalleUsuarioDAO;
import com.workshop.churroscuchito.models.DetalleUsuario;

import com.workshop.churroscuchito.DAO.IOrdenDAO;
import com.workshop.churroscuchito.models.Orden;

import com.workshop.churroscuchito.DAO.IUsuarioDAO;
import com.workshop.churroscuchito.models.Usuario;

import com.workshop.churroscuchito.DAO.IDetalleSolicitudDAO;
import com.workshop.churroscuchito.models.DetalleSolicitud;

import com.workshop.churroscuchito.DAO.ISolicitudDAO;
import com.workshop.churroscuchito.DTO.SolicitudDTO;
import com.workshop.churroscuchito.models.Solicitud;
import com.workshop.churroscuchito.service.ISolicitudService;


@Service
public class SolicitudService implements ISolicitudService{
	@Autowired
	
	IOrdenDAO serviceorden;
	IUsuarioDAO serviceusuario;
	ISolicitudDAO servicesolicitud;
	IEstadoSolicitudDAO serviceestadosolicitud;
	IDetalleSolicitudDAO servicedetallesolicitud;
	
	public Solicitud persist(SolicitudDTO e) {
		
		DetalleSolicitud tt= e.getDetalle();
		servicedetallesolicitud.save(tt);
		Orden o= e.getOrden();
		serviceorden.save(o);
		Solicitud s= e.getSolicitud();
		servicesolicitud.save(s);
		EstadoSolicitud es= e.getEstadosolicitud();
		serviceestadosolicitud.save(es);
		Usuario u= e.getUsuario();
		serviceusuario.save(u);
		return s;
	}

	@Override
	public List<Solicitud> getAll() {
		// TODO Auto-generated method stub
		return servicesolicitud.findAll();
	}

	@Override
	public Solicitud findById(Integer id) {
		// TODO Auto-generated method stub
		return servicesolicitud.findById(id).orElse(null);
	}

	@Override
	public Solicitud merge(Solicitud e) {
		// TODO Auto-generated method stub
		return servicesolicitud.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		servicesolicitud.deleteById(id);;
	}

	@Override
	public Solicitud persist(Solicitud e) {
		// TODO Auto-generated method stub
		return null;
	}
}