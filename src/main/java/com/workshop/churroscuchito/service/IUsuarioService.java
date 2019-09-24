package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.DTO.UsuarioDTO;
import com.workshop.churroscuchito.models.Usuario;

public interface IUsuarioService {
	
	Usuario persist(UsuarioDTO e);
	List<Usuario> getAll();
	Usuario findById(Integer id);
	Usuario merge(Usuario e);
	void delete(Integer id);
}