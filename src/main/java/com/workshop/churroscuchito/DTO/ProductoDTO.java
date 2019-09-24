package com.workshop.churroscuchito.DTO;

import com.workshop.churroscuchito.models.Producto;
import com.workshop.churroscuchito.models.DetalleProducto;

public class ProductoDTO {
	
	private Producto producto;
	private DetalleProducto detalleproducto;
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public DetalleProducto getDetalleproducto() {
		return detalleproducto;
	}
	public void setDetalleproducto(DetalleProducto detalleproducto) {
		this.detalleproducto = detalleproducto;
	}
	
}
