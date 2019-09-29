package com.workshop.churroscuchito.service;

import java.util.List;

import com.workshop.churroscuchito.DTO.OrdenDTO;
import com.workshop.churroscuchito.models.Orden;

public interface IOrdenService {
	
	Orden persist(OrdenDTO e);
	List<Orden> getAll();
	Orden findById(Integer id);
	Orden merge(Orden e);
	void delete(Integer id);
}