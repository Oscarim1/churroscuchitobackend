package com.workshop.churroscuchito.DTO;

import com.workshop.churroscuchito.models.Orden;
import com.workshop.churroscuchito.models.DetalleOrden;
import com.workshop.churroscuchito.models.CatalogoEstadoOrden;

public class OrdenDTO {
	
	private Orden orden;
	private DetalleOrden detalleorden;
	private CatalogoEstadoOrden catalogoestadoorden;
	
	public Orden getOrden() {
		return orden;
	}
	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	public DetalleOrden getDetalleorden() {
		return detalleorden;
	}
	public void setDetalleorden(DetalleOrden detalleorden) {
		this.detalleorden = detalleorden;
	}
	/*public CatalogoEstadoOrden getCatalogoestadoorden() {
		return catalogoestadoorden;
	}
	*/
	public void setCatalogoestadoorden(CatalogoEstadoOrden catalogoestadoorden) {
		this.catalogoestadoorden = catalogoestadoorden;
	}
	public CatalogoEstadoOrden getCatalogoestadoorden() {
		// TODO Auto-generated method stub
		return catalogoestadoorden;
	}
	
	
}

