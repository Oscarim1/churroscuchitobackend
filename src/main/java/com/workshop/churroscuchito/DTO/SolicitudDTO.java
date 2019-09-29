package com.workshop.churroscuchito.DTO;

import com.workshop.churroscuchito.models.DetalleSolicitud;
import com.workshop.churroscuchito.models.DetalleUsuario;
import com.workshop.churroscuchito.models.EstadoSolicitud;
import com.workshop.churroscuchito.models.Orden;
import com.workshop.churroscuchito.models.Solicitud;
import com.workshop.churroscuchito.models.Usuario;

public class SolicitudDTO {
	
	private Solicitud solicitud;
	private DetalleSolicitud detalle;
	private DetalleUsuario detalleusuario;
	private Usuario usuario;
	private Orden orden;
	private EstadoSolicitud estadosolicitud;
	
	public EstadoSolicitud getEstadosolicitud() {
		return estadosolicitud;
	}
	public void setEstadosolicitud(EstadoSolicitud estadosolicitud) {
		this.estadosolicitud = estadosolicitud;
	}
	public Solicitud getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}
	public DetalleSolicitud getDetalle() {
		return detalle;
	}
	public void setDetalle(DetalleSolicitud detalle) {
		this.detalle = detalle;
	}
	public DetalleUsuario getDetalleusuario() {
		return detalleusuario;
	}
	public void setDetalleusuario(DetalleUsuario detalleusuario) {
		this.detalleusuario = detalleusuario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Orden getOrden() {
		return orden;
	}
	public void setOrden(Orden orden) {
		this.orden = orden;
	}
}
