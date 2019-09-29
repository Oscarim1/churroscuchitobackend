package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IDetalleUsuarioDAO;
import com.workshop.churroscuchito.models.DetalleUsuario;
import com.workshop.churroscuchito.service.IDetalleUsuarioService;

@Service

public class DetalleUsuarioService implements IDetalleUsuarioService{
	
	
	@Autowired
	IDetalleUsuarioDAO service;
	@Override
	public DetalleUsuario persist(DetalleUsuario e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public List<DetalleUsuario> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public DetalleUsuario findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public DetalleUsuario merge(DetalleUsuario e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.deleteById(id);
	}

}