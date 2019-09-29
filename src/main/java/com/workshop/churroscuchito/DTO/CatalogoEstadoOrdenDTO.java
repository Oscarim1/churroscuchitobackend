package com.workshop.churroscuchito.DTO;

import com.workshop.churroscuchito.models.EstadoOrden;
import com.workshop.churroscuchito.models.CatalogoEstadoOrden;

public class CatalogoEstadoOrdenDTO {
	
	private EstadoOrden estadoorden;
	private CatalogoEstadoOrden catalogoorden;
	public EstadoOrden getEstadoorden() {
		return estadoorden;
	}
	public void setEstadoorden(EstadoOrden estadoorden) {
		this.estadoorden = estadoorden;
	}
	public CatalogoEstadoOrden getCatalogoorden() {
		return catalogoorden;
	}
	public void setCatalogoorden(CatalogoEstadoOrden catalogoorden) {
		this.catalogoorden = catalogoorden;
	}
	
	
}
