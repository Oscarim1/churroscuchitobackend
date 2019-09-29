package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.ICatalogoEstadoSolicitudDAO;
import com.workshop.churroscuchito.DAO.IEstadoSolicitudDAO;
import com.workshop.churroscuchito.DTO.EstadoSolicitudDTO;
import com.workshop.churroscuchito.models.EstadoSolicitud;
import com.workshop.churroscuchito.models.CatalogoEstadoSolicitud;

import com.workshop.churroscuchito.service.IEstadoSolicitudService;
@Service
public class EstadoSolicitudService implements IEstadoSolicitudService{
	@Autowired
	IEstadoSolicitudDAO service;
	ICatalogoEstadoSolicitudDAO servicedetalle;
	public EstadoSolicitud persist(EstadoSolicitudDTO e) {
			// TODO Auto-generated method stub
			EstadoSolicitud tt= e.getEstado();
			service.save(tt);
			CatalogoEstadoSolicitud dp=e.getCatalogo();
			servicedetalle.save(dp);
			return tt;
			
		}

		@Override
		public List<EstadoSolicitud> getAll() {
			// TODO Auto-generated method stub
			return service.findAll();
		}

		@Override
		public EstadoSolicitud findById(Integer id) {
			// TODO Auto-generated method stub
			return service.findById(id).orElse(null);
		}

		@Override
		public EstadoSolicitud merge(EstadoSolicitud e) {
			// TODO Auto-generated method stub
			return service.save(e);
		}

		@Override
		public void delete(Integer id) {
			// TODO Auto-generated method stub
			service.deleteById(id);;
		}

}