package com.workshop.churroscuchito.DTO;

import com.workshop.churroscuchito.models.DetalleSolicitud;
import com.workshop.churroscuchito.models.DetalleOrden;
import com.workshop.churroscuchito.models.Producto;

public class DetalleSolicitudDTO {
	
	private DetalleSolicitud detalle;
	private DetalleOrden detalleorden;
	private Producto producto;
	public DetalleSolicitud getDetalle() {
		return detalle;
	}
	public void setDetalle(DetalleSolicitud detalle) {
		this.detalle = detalle;
	}
	public DetalleOrden getDetalleorden() {
		return detalleorden;
	}
	public void setDetalleorden(DetalleOrden detalleorden) {
		this.detalleorden = detalleorden;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
