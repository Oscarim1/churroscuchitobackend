package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.models.DetalleUsuario;

public interface IDetalleUsuarioService {
	
	DetalleUsuario persist(DetalleUsuario e);
	List<DetalleUsuario> getAll();
	DetalleUsuario findById(Integer id);
	DetalleUsuario merge(DetalleUsuario e);
	void delete(Integer id);
}