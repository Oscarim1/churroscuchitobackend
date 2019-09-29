package com.workshop.churroscuchito.DTO;

import com.workshop.churroscuchito.models.EstadoSolicitud;
import com.workshop.churroscuchito.models.CatalogoEstadoSolicitud;;

public class EstadoSolicitudDTO {
	
	private EstadoSolicitud estado;
	private CatalogoEstadoSolicitud catalogo;
	public EstadoSolicitud getEstado() {
		return estado;
	}
	public void setEstado(EstadoSolicitud estado) {
		this.estado = estado;
	}
	public CatalogoEstadoSolicitud getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(CatalogoEstadoSolicitud catalogo) {
		this.catalogo = catalogo;
	}
	
	
	
}
