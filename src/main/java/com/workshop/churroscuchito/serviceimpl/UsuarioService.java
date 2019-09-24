package com.workshop.churroscuchito.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.churroscuchito.DAO.IDetalleUsuarioDAO;
import com.workshop.churroscuchito.DAO.IUsuarioDAO;
import com.workshop.churroscuchito.DTO.UsuarioDTO;
import com.workshop.churroscuchito.models.Usuario;
import com.workshop.churroscuchito.models.DetalleUsuario;
import com.workshop.churroscuchito.service.IUsuarioService;
@Service
public class UsuarioService implements IUsuarioService{
	@Autowired
	IUsuarioDAO service;
	IDetalleUsuarioDAO servicedetalle;
	public Usuario persist(UsuarioDTO e) {
		// TODO Auto-generated method stub
		Usuario tt= e.getUsuario();
		service.save(tt);
		DetalleUsuario du=e.getDetalleusuario();
		servicedetalle.save(du);
		return tt;
		};
		
		
	

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public Usuario findById(Integer id) {
		// TODO Auto-generated method stub
		return service.findOne(id);
	}

	@Override
	public Usuario merge(Usuario e) {
		// TODO Auto-generated method stub
		return service.save(e);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}